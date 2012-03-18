package middleware.services.nameservice;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;

import middleware.proxies.ClientProxy;

public class Naming {

	public static Object lookup(String nome) {
		if (!nome.equalsIgnoreCase("//" + NameServiceConfig.HOST + ":"
				+ NameServiceConfig.PORT)) {
			return null;
		} else {
			return new ClientProxy();
		}
	}

	public static void rebind(String name) {

		StringBuffer msg = new StringBuffer();
		msg.append("rebind");

		Socket clientSocket = null;
		try {
			clientSocket = new Socket(NameServiceConfig.HOST,
					NameServiceConfig.PORT);

			DataOutputStream dataOut;
			dataOut = new DataOutputStream(clientSocket.getOutputStream());
			msg.append(name);
			dataOut.write(msg.toString().getBytes());
			clientSocket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Retorna as configuracoes de todas as maquinas que provêem o determinado
	 * serviço
	 */
	public static String skyNet(String name) {

		String retorno = "";
		StringBuffer msg = new StringBuffer();
		Socket clientSocket = null;
		try {
			clientSocket = new Socket(NameServiceConfig.HOST,
					NameServiceConfig.PORT);

			DataOutputStream dataOut;
			dataOut = new DataOutputStream(clientSocket.getOutputStream());
			msg.append(name);
			dataOut.write(msg.toString().getBytes());

			clientSocket.close();

			ServerSocket connectionSocket = new ServerSocket(8480);
			Socket sock = connectionSocket.accept();
			BufferedReader inFromClient = new BufferedReader(
					new InputStreamReader(sock.getInputStream()));

			boolean flag = true;
			byte[] providers = null;
			Vector<Byte> temp = new Vector<Byte>();
			while (flag) {
				int i = inFromClient.read();
				if (i == -1)
					flag = false;
				else
					temp.add((byte) i);
			}
			providers = new byte[temp.size()];
			for (int i = 0; i < providers.length; i++) {
				providers[i] = temp.get(i);
			}

			retorno = new String(providers);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return retorno;
	}

}
