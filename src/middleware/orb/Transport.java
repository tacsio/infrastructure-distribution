package middleware.orb;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.StringTokenizer;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import middleware.Protocolo;
import middleware.serializer.Marshaller;
import middleware.util.Configuracao;
import middleware.util.LoadConfig;

public class Transport implements ORB {

	private Configuracao conf;

	public Transport() {

		conf = new Configuracao();
		try {
			new LoadConfig(conf);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void send(byte[] msg) {

		if (conf.getProtocol() == Protocolo.TPC) {
			try {
				sendTPC(msg);
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (conf.getProtocol() == Protocolo.UDP) {
			try {
				sendUDP(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (conf.getProtocol() == Protocolo.HTTP) {
			try {
				sendHttp(msg);
			} catch (IOException e) {
				e.getMessage();
			}
		}

	}

	@Override
	public byte[] receive() {

		if (conf.getProtocol() == Protocolo.TPC) {
			try {
				return receiveTCP();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (conf.getProtocol() == Protocolo.UDP) {
			try {
				return receiveUDP();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (conf.getProtocol() == Protocolo.HTTP) {
			try {
				return receiveHttp();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	private void sendTPC(byte[] msg) throws UnknownHostException, IOException {
		Socket clientSocket = null;
		clientSocket = new Socket(conf.getHost(), conf.getPort());
		DataOutputStream dataOut;
		dataOut = new DataOutputStream(clientSocket.getOutputStream());
		dataOut.write(msg);
		clientSocket.close();
	}

	private byte[] receiveTCP() throws IOException {

		ServerSocket welcomeSocket = new ServerSocket(conf.getPort());
		Socket connectionSocket = welcomeSocket.accept();
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader(
				connectionSocket.getInputStream()));

		String m = inFromClient.readLine();
		byte[] msg = m.getBytes();

		welcomeSocket.close();
		connectionSocket.close();

		return msg;
	}

	private void sendUDP(byte[] msg) throws IOException {

		DatagramSocket clientSocket = new DatagramSocket();
		InetAddress IPAddres = InetAddress.getByName(conf.getHost());
		DatagramPacket sendPacket = new DatagramPacket(msg, msg.length,
				IPAddres, conf.getPort());
		clientSocket.send(sendPacket);
	}

	private byte[] receiveUDP() throws IOException {

		DatagramSocket serverSocket = new DatagramSocket(conf.getPort());
		byte[] temp = new byte[serverSocket.getReceiveBufferSize()];
		DatagramPacket receivePacket = new DatagramPacket(temp, temp.length);
		serverSocket.receive(receivePacket);

		byte[] msg = new byte[receivePacket.getLength()];
		for (int i = 0; i < msg.length; i++) {
			msg[i] = receivePacket.getData()[i];
		}

		serverSocket.close();

		return msg;
	}

	private void sendHttp(byte[] msg) throws IOException {

		byte[] temp = new byte[msg.length - 1];
		temp = Marshaller.extractDados(msg);

		StringBuffer s = new StringBuffer();
		s.append(msg[0]);
		if (msg[0] == Protocolo.BOOLEAN) {
			s.append(msg[1]);
		} else if (msg[0] == Protocolo.CHAR) {
			s.append((char) msg[1]);
		} else if (msg[0] == Protocolo.BYTE) {
			s.append(msg[1]);
		} else if (msg[0] == Protocolo.INT) {
			s.append(Marshaller.byteArrayToInt(temp));
		} else if (msg[0] == Protocolo.SHORT) {
			s.append(Short.parseShort(new String(temp)));
		} else if (msg[0] == Protocolo.LONG) {
			s.append(Long.parseLong(new String(temp)));
		} else if (msg[0] == Protocolo.FLOAT) {
			s.append(Float.parseFloat(new String(temp)));
		} else if (msg[0] == Protocolo.DOUBLE) {
			s.append(Double.parseDouble(new String(temp)));
		} else if (msg[0] == Protocolo.STRING) {
			s.append(new String(temp));
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					s.setCharAt(i, '\0');
				}
			}
		}

		//method GET
		URL url = new URL("http://" + conf.getHost() + "/data=" + s);
		url.openStream();
	}

	private byte[] receiveHttp() throws IOException {

		ServerSocket listenSocket = new ServerSocket(80);
		Socket connectionSocket = listenSocket.accept();
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader(
				connectionSocket.getInputStream()));

		String requestMessageLine = inFromClient.readLine();
		String data = "";
		listenSocket.close();
		connectionSocket.close();

		StringTokenizer tokenizedLine = new StringTokenizer(requestMessageLine);
		if (tokenizedLine.nextToken().equals("GET")) {
			data = tokenizedLine.nextToken();

			if (data.startsWith("/")) {
				data = data.substring(6);
				data = data.replace('\0', ' ');

				byte[] temp = data.substring(1).getBytes();
				byte[] msg = new byte[temp.length + 1];

				msg[0] = (byte) (data.charAt(0) - 48);

				for (int i = 0; i < msg.length - 1; i++) {
					msg[i + 1] = temp[i];
				}
				return msg;
			}
		}

		return null;
	}

}
