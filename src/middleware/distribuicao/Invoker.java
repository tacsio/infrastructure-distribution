package middleware.distribuicao;

import middleware.orb.Broker;

public class Invoker {

	private Broker serverRequestHandler;
	private RemoteObject remoteObject;

	public Invoker() {
		serverRequestHandler = new Broker();
		invoke();
	}

	public void invoke() {

		byte[] msg = (byte[]) serverRequestHandler.receive();

		Message m = Message.getMessage(msg);

		String method = m.getMethod();

		Object[] parametro = m.getParams();
		remoteObject = new RemoteObject();

		int retorno = 0;
		if (method.equalsIgnoreCase("CelsiusToKelvin")) {
			retorno = remoteObject
					.convertCelsiusToKelvin((Integer) parametro[0]);
		} else if (method.equalsIgnoreCase("KelvinToCelsius")) {
			retorno = remoteObject.convertKelvinToCelsius(
					(Integer) parametro[0], (String) parametro[1], (Float) parametro[2]);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.getMessage();
		}

		serverRequestHandler.send(retorno);
	}

	public static void main(String[] args) {
		new Invoker();
	}
}
