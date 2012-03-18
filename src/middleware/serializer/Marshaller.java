package middleware.serializer;

import middleware.Protocolo;

public class Marshaller {

	public static byte[] marshallBoolean(boolean m) {
		byte[] msg = new byte[2];
		msg[0] = Protocolo.BOOLEAN;

		if (m == true) {
			msg[1] = 1;
		} else {
			msg[1] = 0;
		}
		return msg;

	}

	public static byte[] marshallChar(char m) {
		byte[] msg = new byte[2];
		msg[0] = Protocolo.CHAR;
		msg[1] = (byte) m;

		return msg;
	}

	public static byte[] marshallByte(byte m) {
		byte[] msg = new byte[2];
		msg[0] = Protocolo.BYTE;
		msg[1] = (byte) m;

		return msg;
	}

	public static byte[] marshallInt(int m) {

		byte[] temp = intToByteArray(m);
		byte[] msg = escreveCabecalho(temp, Protocolo.INT);

		return msg;
	}

	// TODO: Serializar manualmente apartir daqui
	public static byte[] marshallShort(short m) {

		byte[] temp = Short.toString(m).getBytes();
		byte[] msg = escreveCabecalho(temp, Protocolo.SHORT);

		return msg;

	}

	public static byte[] marshallLong(long m) {

		byte[] temp = Long.toString(m).getBytes();
		byte[] msg = escreveCabecalho(temp, Protocolo.LONG);

		return msg;
	}

	public static byte[] marshallFloat(float m) {
		byte[] temp = Float.toString(m).getBytes();
		byte[] msg = escreveCabecalho(temp, Protocolo.FLOAT);

		return msg;
	}

	public static byte[] marshallDouble(double m) {
		byte[] temp = Double.toString(m).getBytes();
		byte[] msg = escreveCabecalho(temp, Protocolo.DOUBLE);

		return msg;
	}

	public static byte[] marshallString(String m) {
		byte[] temp = m.getBytes();
		byte[] msg = escreveCabecalho(temp, Protocolo.STRING);

		return msg;
	}

	public static boolean unmarshallBoolean(byte[] msg) {
		if (msg[1] == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static char unmarshallChar(byte[] msg) {
		return (char) msg[1];
	}

	public static byte unmarshallByte(byte[] msg) {
		return (byte) msg[1];
	}

	public static int unmarshallInt(byte[] msg) {
		byte[] temp = extractDados(msg);
		return byteArrayToInt(temp);
	}

	// TODO: Serializar manualmente apartir daqui
	public static short unmarshallShort(byte[] msg) {
		byte[] temp = extractDados(msg);
		return Short.parseShort(new String(temp));
	}

	public static long unmarshallLong(byte[] msg) {
		byte[] temp = extractDados(msg);
		return Long.parseLong(new String(temp));
	}

	public static float unmarshallFloat(byte[] msg) {
		byte[] temp = extractDados(msg);
		return Float.parseFloat(new String(temp));
	}

	public static double unmarshallDouble(byte[] msg) {
		byte[] temp = extractDados(msg);
		return Double.parseDouble(new String(temp));
	}

	public static String unmarshallString(byte[] msg) {
		byte[] temp = extractDados(msg);
		return new String(temp);
	}

	private static byte[] escreveCabecalho(byte[] temp, byte tipo) {
		byte[] msg = new byte[temp.length + 1];
		msg[0] = tipo;
		for (int i = 0; i < temp.length; i++) {
			msg[i + 1] = temp[i];
		}
		return msg;
	}

	public static byte[] extractDados(byte[] msg) {
		byte[] temp = new byte[msg.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = msg[i + 1];
		}
		return temp;
	}

	private static byte[] intToByteArray(int value) {
		return new byte[] { (byte) (value >>> 24), (byte) (value >>> 16),
				(byte) (value >>> 8), (byte) value };
	}

	public static int byteArrayToInt(byte[] b) {
		return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)
				+ (b[3] & 0xFF);
	}
}