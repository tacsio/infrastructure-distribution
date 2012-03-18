package middleware.distribuicao;

import middleware.orb.Broker;
import middleware.services.nameservice.Naming;

public class ServerRequestHandler implements Runnable {

	private final String HOST = "192.168.1.101";
	private final int PORT = 5790;

	private Broker broker;
	private static ServerRequestHandler instance;

	private ServerRequestHandler() {

		for (int i = 0; i < RemoteObject.class.getDeclaredMethods().length; i++) {
			Naming.rebind("//"
					+ HOST
					+ ":"
					+ PORT
					+ "/"
					+ RemoteObject.class.getDeclaredMethods()[i].getName()
							.toLowerCase());
		}

		broker = new Broker(HOST, PORT);
	}

	public static ServerRequestHandler getInstance() {
		if (instance == null) {
			instance = new ServerRequestHandler();
		}
		return instance;
	}

	public void receive() {
		System.out.println("SERVER READY");
		Thread escuta = new Thread(this);
		escuta.run();
		this.receive();
	}

	public void send(Object m) {
		broker.send(m);
	}

	@Override
	public void run() {

		try {
			byte[] msg = (byte[]) broker.receive();
			System.out.println("request accepted");
			new Invoker().invoke(msg);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		getInstance().receive();
	}

}
