package middleware.distribuicao;

import middleware.Protocolo;
import middleware.marshaller.Marshaller;

public class Message {

	private String method;
	private Object[] params;

	public Message(String method, Object... params) {
		this.method = method;
		this.params = params;
	}

	public byte[] getBytes() {

		int length = 3;
		byte[] method = Marshaller.marshallString(this.method);
		length += method.length;

		byte[] params = null;
		byte[][] temp = new byte[this.params.length][];

		for (int i = 0; i < this.params.length; i++) {

			temp[i] = escreveCabecalhoMensagem(Marshaller
					.marshall(this.params[i]));
		}

		for (int i = 0; i < this.params.length; i++) {
			params = Marshaller.append(params, temp[i]);
		}

		length += params.length;
		byte[] retorno = new byte[length];

		retorno[Protocolo.TIPO] = Protocolo.MESSAGE; // Tipo do stream de bytes
		retorno[Protocolo.LENGTH_METODO] = (byte) method.length;
		retorno[Protocolo.NUMERO_PARAMETROS] = (byte) this.params.length;

		// adicionando o nome do metodo na mensagem
		for (int i = 0; i < method.length; i++) {
			retorno[i + 3] = method[i];
		}
		// adicionando os paramentros na mensagem
		for (int i = 3 + method.length; i < retorno.length; i++) {
			retorno[i] = params[i - (3 + method.length)];
		}

		return retorno;
	}

	public static Message getMessage(byte[] msg) {
		// msg ja eh o array de bytes vindo do extract dados, logo nao possui o
		// campo tipo no primerio byte

		byte lenght = msg[Protocolo.LENGTH_METODO - 1];

		// pega o nome do metodo
		byte[] method = new byte[lenght];
		for (int i = 0; i < lenght; i++) {
			method[i] = msg[i + 2];
		}
		String nome = Marshaller.unmarshallString(method);

		byte num_param = msg[Protocolo.NUMERO_PARAMETROS - 1];
		Object[] params = new Object[num_param];

		// +2 devido os 2 campos dop protocolo
		int padding = lenght + 2;
		for (int i = 0; i < num_param; i++) {
			params[i] = Marshaller.unmarshall(getParam(padding, msg));

			padding += msg[padding] + 1;
		}

		Message retorno = new Message(nome, params);

		return retorno;
	}

	private static byte[] getParam(int n, byte[] msg) {
		int index = msg[n];
		byte[] retorno = new byte[index];
		for (int i = 0; i < index; i++) {
			retorno[i] = msg[n + i + 1];
		}
		return retorno;
	}

	public String getMethod() {
		return method;
	}

	public Object[] getParams() {
		return params;
	}

	private byte[] escreveCabecalhoMensagem(byte[] temp) {
		byte[] retorno = new byte[temp.length + 1];
		retorno[Protocolo.LENGTH_PARAMETRO] = (byte) temp.length;

		for (int i = 0; i < temp.length; i++) {
			retorno[i + 1] = temp[i];
		}

		return retorno;
	}

}
