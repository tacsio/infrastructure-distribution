package middleware;

import middleware.serializer.Marshaller;

public class Requestor {

	private Exercicio1 clientRequestHandler;

	public Requestor() {
		clientRequestHandler = new Exercicio1();
	}

	//TODO: passagem de identificador do metodo como String
	public int invoke(int metodo, int parametro) {

		byte[] temp1 = Marshaller.marshallInt(metodo);
		byte[] temp2 = Marshaller.marshallInt(parametro);
		byte[] msg = new byte[temp1.length + temp2.length + 2];

		msg[0] = Protocolo.MESSAGE;
		msg[1] = (byte) temp1.length;

		for (int i = 0; i < temp1.length; i++) {
			msg[i + 2] = temp1[i];
		}

		for (int i = 2 + temp2.length; i < msg.length; i++) {
			msg[i] = temp2[i - 2 - temp2.length];
		}

		clientRequestHandler.send(msg);

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
