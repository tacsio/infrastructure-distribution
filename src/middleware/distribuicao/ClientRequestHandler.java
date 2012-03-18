package middleware.distribuicao;

import middleware.orb.Broker;

public class ClientRequestHandler implements Runnable {

	public byte[] msg;

	private Broker broker;
	private static ClientRequestHandler instance;

	private ClientRequestHandler(String host, int port) {
		broker = new Broker(host, port);
	}

	public static ClientRequestHandler getInstance(String host, int port) {
		if (instance == null) {
			instance = new ClientRequestHandler(host, port);
		}
		instance.broker = new Broker(host, port);
		return instance;
	}

	public void send(byte[] msg) {
		broker.send(msg);
	}

	public Object receive() {
		return broker.receive();
	}

	@Override
	public void run() {
		send(msg);
	}

}
