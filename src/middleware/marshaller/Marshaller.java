package middleware.marshaller;

import java.util.Vector;

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
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.INT);

		return msg;
	}

	public static byte[] marshallShort(short m) {

		byte[] temp = Short.toString(m).getBytes();
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.SHORT);

		return msg;

	}

	public static byte[] marshallLong(long m) {

		byte[] temp = Long.toString(m).getBytes();
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.LONG);

		return msg;
	}

	public static byte[] marshallFloat(float m) {
		byte[] temp = Float.toString(m).getBytes();
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.FLOAT);

		return msg;
	}

	public static byte[] marshallDouble(double m) {
		byte[] temp = Double.toString(m).getBytes();
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.DOUBLE);

		return msg;
	}

	public static byte[] marshallString(String m) {
		byte[] temp = m.getBytes();
		byte[] msg = escreveCabecalhoTransporte(temp, Protocolo.STRING);

		return msg;
	}

	public static byte[] marshallIntArray(int[] m) {
		Vector<Byte> temp = new Vector<Byte>();
		for (int i = 0; i < m.length; i++) {
			byte[] temp2 = marshallInt(m[i]);
			for (int j = 0; j < temp2.length; j++) {
				temp.add(temp2[j]);
			}
		}
		byte[] retorno = new byte[temp.size() + 1];
		for (int i = 0; i < temp.size(); i++) {
			retorno[i + 1] = temp.get(i);
		}
		retorno[0] = Protocolo.INT_ARRAY;

		return retorno;
	}

	public static int[] unmarshallIntArray(byte[] msg) {
		if (msg == null)
			return null;

		int[] retorno = new int[(msg.length - 1) / 5];// padding int
		int count = 0;
		for (int i = 0; i < retorno.length; i++) {
			byte[] temp = new byte[5];
			for (int j = 0; j < temp.length; j++) {
				temp[j] = msg[j + 1 + count];
			}
			count = count + 5;
			retorno[i] = unmarshallInt(temp);
		}
		return retorno;
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

	private static byte[] escreveCabecalhoTransporte(byte[] temp, byte tipo) {
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

	public static byte[] append(byte[] data1, byte[] data2) {

		if (data1 == null) {
			return data2;
		} else if (data2 == null) {
			return data1;
		}

		byte[] retorno = new byte[data1.length + data2.length];

		for (int i = 0; i < data1.length; i++) {
			retorno[i] = data1[i];
		}
		for (int i = data1.length; i < retorno.length; i++) {
			retorno[i] = data2[i - data1.length];
		}

		return retorno;
	}

	public static byte[] marshall(Object m) {
		if (m instanceof Boolean) {
			return marshallBoolean(((Boolean) m).booleanValue());
		} else if (m instanceof Character) {
			return marshallChar(((Character) m).charValue());
		} else if (m instanceof Byte) {
			return marshallByte(((Byte) m).byteValue());
		} else if (m instanceof Integer) {
			return marshallInt(((Integer) m).intValue());
		} else if (m instanceof Short) {
			return marshallShort(((Short) m).shortValue());
		} else if (m instanceof Long) {
			return marshallLong(((Long) m).longValue());
		} else if (m instanceof Float) {
			return marshallFloat(((Float) m).floatValue());
		} else if (m instanceof Double) {
			return marshallDouble(((Double) m).doubleValue());
		} else if (m instanceof String) {
			return marshallString(m.toString());
		} else if (m instanceof int[]) {
			return marshallIntArray((int[]) m);
		}

		return null;
	}

	public static Object unmarshall(byte[] msg) {

		if (msg[0] == Protocolo.BOOLEAN) {
			return unmarshallBoolean(msg);
		} else if (msg[0] == Protocolo.CHAR) {
			return unmarshallChar(msg);
		} else if (msg[0] == Protocolo.BYTE) {
			return unmarshallByte(msg);
		} else if (msg[0] == Protocolo.INT) {
			return unmarshallInt(msg);
		} else if (msg[0] == Protocolo.SHORT) {
			return unmarshallShort(msg);
		} else if (msg[0] == Protocolo.LONG) {
			return unmarshallLong(msg);
		} else if (msg[0] == Protocolo.FLOAT) {
			return unmarshallFloat(msg);
		} else if (msg[0] == Protocolo.DOUBLE) {
			return unmarshallDouble(msg);
		} else if (msg[0] == Protocolo.STRING) {
			return unmarshallString(msg);
		} else if (msg[0] == Protocolo.INT_ARRAY) {
			return unmarshallIntArray(msg);
		}
		return null;
	}

	private static byte[] intToByteArray(int value) {
		return new byte[] { (byte) (value >>> 24), (byte) (value >>> 16),
				(byte) (value >>> 8), (byte) value };
	}

	private static int byteArrayToInt(byte[] b) {
		return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)
				+ (b[3] & 0xFF);
	}
}
