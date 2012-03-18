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

	public Message(String method, int[] list) {
		this.method = method;
		this.params = new Object[list.length];
		for (int i = 0; i < list.length; i++) {
			this.params[i] = list[i];
		}
	}

	public byte[] getBytes() {

		int length = Protocolo.PADDING;
		byte[] method = Marshaller.marshallString(this.method);
		length += method.length;

		byte[] paramsByte = null;
		byte[][] temp = new byte[this.params.length][];

		for (int i = 0; i < this.params.length; i++) {
			temp[i] = escreveCabecalhoMensagem(Marshaller
					.marshall(this.params[i]));
		}

		for (int i = 0; i < this.params.length; i++) {
			paramsByte = Marshaller.append(paramsByte, temp[i]);
		}

		length += paramsByte.length;
		byte[] retorno = new byte[length];

		retorno[Protocolo.TIPO] = Protocolo.MESSAGE; // Tipo do stream de bytes
		retorno[Protocolo.LENGTH_METODO] = (byte) method.length;

		byte[] numParams = Marshaller.marshallInt(this.params.length);
		for (int i = 0; i < 5; i++) {
			retorno[Protocolo.PADDING_PARAMETROS + i + 1] = numParams[i];
		}
		retorno[Protocolo.PADDING_PARAMETROS] = 5;

		// adicionando o nome do metodo na mensagem
		for (int i = 0; i < method.length; i++) {
			retorno[i + Protocolo.PADDING] = method[i];
		}
		// adicionando os paramentros na mensagem
		for (int i = Protocolo.PADDING + method.length; i < retorno.length; i++) {
			retorno[i] = paramsByte[i - (Protocolo.PADDING + method.length)];
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
			method[i] = msg[i + Protocolo.PADDING - 1];
		}
		String nome = Marshaller.unmarshallString(method);

		int numParams = Marshaller.unmarshallInt(getParam(
				Protocolo.PADDING_PARAMETROS - 1, msg));

		Object[] params = new Object[numParams];

		// +padding devido os campos do protocolo
		int padding = lenght + Protocolo.PADDING - 1;

		for (int i = 0; i < numParams; i++) {
			params[i] = Marshaller.unmarshall(getParam(padding, msg));

			padding += msg[padding] + 1;
		}

		Message retorno = new Message(nome, params);

		return retorno;
	}

	/**
	 * Nova abordagem para construcao da mensagem de maneira eficiente
	 */
	public byte[] getBytes(int[] list) {

		int length = Protocolo.PADDING_PARAMETROS;
		byte[] method = Marshaller.marshallString(this.method);
		length += method.length;

		// byte[] parametros = Marshaller.marshallIntArray(list);
		byte[] parametros = Marshaller.marshall(list);
		int lenParam = parametros.length;
		length += lenParam;

		byte[] retorno = new byte[length];

		retorno[Protocolo.TIPO] = Protocolo.MESSAGE_ARRAY; // Tipo do stream de
															// bytes
		retorno[Protocolo.LENGTH_METODO] = (byte) method.length;

		// add method name
		for (int i = 0; i < method.length; i++) {
			retorno[i + Protocolo.PADDING_PARAMETROS] = method[i];
		}
		// add params
		int padding = Protocolo.PADDING_PARAMETROS + method.length;
		for (int i = padding; i < retorno.length; i++) {
			retorno[i] = parametros[i - (padding)];
		}

		return retorno;

	}

	/**
	 * Seguindo a nova abordagem de construcao de mensagem
	 * 
	 * @see: Exclusivo para arrays como parametro
	 */
	public static Message convertToMessage(byte[] msg) {
		// method name
		byte lenght = msg[Protocolo.LENGTH_METODO - 1];
		byte[] method = new byte[lenght];
		for (int i = 0; i < lenght; i++) {
			method[i] = msg[i + Protocolo.PADDING_PARAMETROS - 1];
		}
		String nome = Marshaller.unmarshallString(method);
		// length parametros
		int packageLength = (msg.length - 1) - method.length;
		byte[] temp = new byte[packageLength];
		int padding = Protocolo.PADDING_PARAMETROS - 1 + method.length;
		for (int i = 0; i < temp.length; i++) {
			temp[i] = msg[padding + i];
		}
		int[] parametros = (int[]) Marshaller.unmarshall(temp);

		return new Message(nome, parametros);
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

	private static byte[] getParam(int n, byte[] msg) {
		int index = msg[n];
		byte[] retorno = new byte[index];
		for (int i = 0; i < index; i++) {
			retorno[i] = msg[n + i + 1];
		}
		return retorno;
	}

}
