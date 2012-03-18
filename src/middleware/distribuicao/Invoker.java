package middleware.distribuicao;

import middleware.Protocolo;
import middleware.marshaller.Marshaller;

public class Invoker {

	private ServerRequestHandler serverRequestHandler;
	private RemoteObject remoteObject;

	public Invoker() {
		serverRequestHandler = ServerRequestHandler.getInstance();
	}

	public void invoke(byte[] msg) {

		Message m = null;
		if (msg[0] == Protocolo.MESSAGE)
			m = Message.getMessage(Marshaller.extractDados(msg));
		else
			m = Message.convertToMessage(Marshaller.extractDados(msg));

		String method = m.getMethod();

		Object[] parametro = m.getParams();

		remoteObject = new RemoteObject();

		if (method.equalsIgnoreCase("CelsiusToKelvin")) {
			int retorno = remoteObject
					.convertCelsiusToKelvin((Integer) parametro[0]);

			serverRequestHandler.send(retorno);

		} else if (method.equalsIgnoreCase("KelvinToCelsius")) {
			int retorno = remoteObject
					.convertKelvinToCelsius((Integer) parametro[0]);

			serverRequestHandler.send(retorno);

		} else if (method.equalsIgnoreCase("Ord")) {
			int[] list = new int[parametro.length];

			for (int i = 0; i < parametro.length; i++) {
				list[i] = (Integer) parametro[i];
			}

			int[] retorno = remoteObject.ord(list);
			// TODO:mostrar a divisao de carga
			System.out.println("Array:");
			for (int i = 0; i < retorno.length; i++) {
				System.err.print(retorno[i] + " ");
			}
			//
			serverRequestHandler.send(retorno);
		} else if (method.equalsIgnoreCase("getMachineRank")) {
			int retorno = remoteObject.getMachineRank();
			serverRequestHandler.send(retorno);
		}
	}
}
