package middleware.services.securityservice;

public class Cripto {

	public static byte[] encript(byte[] msg) {
		for (int i = 0; i < msg.length; i++) {
			msg[i] = (byte) (msg[i] + (byte) 1);
		}
		return msg;
	}

	public static byte[] decript(byte[] msg) {
		for (int i = 0; i < msg.length; i++) {
			msg[i] = (byte) (msg[i] - (byte) 1);
		}

		return msg;
	}
}
