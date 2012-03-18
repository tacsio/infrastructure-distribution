package middleware;

import middleware.serializer.Marshaller;
import apps.Aplicacao_2;

public class Invoker {

	private Exercicio1 serverRequestHandler;
	private Aplicacao_2 remoteObject;

	public Invoker() {
		serverRequestHandler = new Exercicio1();
		invoke();
	}

	public void invoke() {
		byte[] msg = (byte[]) serverRequestHandler.receive();
		byte len = msg[Protocolo.TAMANHO_MENSAGEM];

		byte[] temp1 = new byte[len];
		for (int i = 0; i < len; i++) {
			temp1[i] = msg[i + 1];
		}

		byte[] temp2 = new byte[msg.length - temp1.length];
		for (int i = 0; i < (msg.length - 1 - temp1.length); i++) {
			temp2[i] = msg[i + (msg.length - temp1.length)];
		}

		int metodo = Marshaller.unmarshallInt(temp1);
		int parametro = Marshaller.unmarshallInt(temp2);

		remoteObject = new Aplicacao_2();
		// TODO: melhorar protocolo
		int retorno = 0;
		if (metodo == 1) {
			retorno = remoteObject.convertCelsiusToKelvin(parametro);
		} else if (metodo == 2) {
			retorno = remoteObject.convertKelvinToCelsius(parametro);
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
