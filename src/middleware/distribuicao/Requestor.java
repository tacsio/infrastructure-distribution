package middleware.distribuicao;

import middleware.orb.Broker;

public class Requestor {

	private Broker clientRequestHandler;

	public Requestor() {
		clientRequestHandler = new Broker();
	}

	public int invoke(String method, Object... params) {

		Message msg = new Message(method, params);

		clientRequestHandler.send(msg.getBytes());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		Integer retorno = null;
		retorno = (Integer) clientRequestHandler.receive();

		return retorno;

	}

}
