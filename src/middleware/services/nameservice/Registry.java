package middleware.services.nameservice;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Vector;

public class Registry {

	public static HashMap<String, Vector<String>> registry = new HashMap<String, Vector<String>>();

	public static void main(String[] args) {

		ServerSocket listemSocket;
		Socket connectionSocket;

		try {
			listemSocket = new ServerSocket(NameServiceConfig.PORT);// porta nameservice
			System.out.println("name service ON");
			while (true) {
				connectionSocket = listemSocket.accept();
				DataProvider dp = new DataProvider(connectionSocket);
				new Thread(dp).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

class DataProvider implements Runnable {

	private Socket connectionSocket;
	private BufferedReader inFromClient = null;

	public DataProvider(Socket s) throws IOException {
		connectionSocket = s;

		inFromClient = new BufferedReader(new InputStreamReader(
				connectionSocket.getInputStream()));

		String request = inFromClient.readLine();
		String type = (true == request.contains("rebind")) ? "rebind"
				: "lookup";

		// REBIND
		if (type.equals("rebind")) {
			String endereco;
			String porta;
			String name;

			int indexName = 0;
			int indexPorta = 0;

			for (int i = 0; i < request.length(); i++) {
				if (request.charAt(i) == ':') {
					indexPorta = i;
				}

				if (request.charAt(i) == '/' && i > indexPorta) {
					indexName = i;
				}
			}
			endereco = request.substring(8, indexPorta);
			porta = request.substring(indexPorta + 1, indexName);
			name = request.substring(indexName + 1, request.length());

			Vector<String> temp = new Vector<String>();
			if (Registry.registry.containsKey(name)) {
				Registry.registry.get(name).add(endereco + ":" + porta);
			} else {
				temp.add(endereco + ":" + porta);
				Registry.registry.put(name, temp);
			}

			// LOOKUP ADDRESS
		} else {
			Vector<String> v = Registry.registry.get(request.toLowerCase());
			StringBuffer buff = new StringBuffer("/");

			for (int j = 0; j < v.size(); j++) {
				buff.append(v.get(j) + "/");
			}

			Socket sock = new Socket(connectionSocket.getInetAddress(), 8480);
			DataOutputStream dataOut;
			dataOut = new DataOutputStream(sock.getOutputStream());
			dataOut.write(buff.toString().getBytes());
			sock.close();
		}
	}

	public void run() {

		try {
			connectionSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
