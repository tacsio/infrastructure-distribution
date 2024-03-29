package middleware.orb;

import middleware.Protocolo;
import middleware.marshaller.Marshaller;

public class Broker {

	private Transport orb;

	public Broker(String host, int port) {

		orb = new Transport(host, port);
	}

	public void send(Object m) {

		if (m instanceof Boolean) {
			orb.send(Marshaller.marshallBoolean(((Boolean) m).booleanValue()));
		} else if (m instanceof Character) {
			orb.send(Marshaller.marshallChar(((Character) m).charValue()));
		} else if (m instanceof Byte) {
			orb.send(Marshaller.marshallByte(((Byte) m).byteValue()));
		} else if (m instanceof Integer) {
			orb.send(Marshaller.marshallInt(((Integer) m).intValue()));
		} else if (m instanceof Short) {
			orb.send(Marshaller.marshallShort(((Short) m).shortValue()));
		} else if (m instanceof Long) {
			orb.send(Marshaller.marshallLong(((Long) m).longValue()));
		} else if (m instanceof Float) {
			orb.send(Marshaller.marshallFloat(((Float) m).floatValue()));
		} else if (m instanceof Double) {
			orb.send(Marshaller.marshallDouble(((Double) m).doubleValue()));
		} else if (m instanceof String) {
			orb.send(Marshaller.marshallString(m.toString()));
		} else if (m instanceof int[]) {
			orb.send(Marshaller.marshallIntArray((int[]) m));
		}
	}

	public Object receive() {

		byte[] msg = orb.receive();
		if (msg[0] == Protocolo.BOOLEAN) {
			return Marshaller.unmarshallBoolean(msg);
		} else if (msg[0] == Protocolo.CHAR) {
			return Marshaller.unmarshallChar(msg);
		} else if (msg[0] == Protocolo.BYTE) {
			return Marshaller.unmarshallByte(msg);
		} else if (msg[0] == Protocolo.INT) {
			return Marshaller.unmarshallInt(msg);
		} else if (msg[0] == Protocolo.SHORT) {
			return Marshaller.unmarshallShort(msg);
		} else if (msg[0] == Protocolo.LONG) {
			return Marshaller.unmarshallLong(msg);
		} else if (msg[0] == Protocolo.FLOAT) {
			return Marshaller.unmarshallFloat(msg);
		} else if (msg[0] == Protocolo.DOUBLE) {
			return Marshaller.unmarshallDouble(msg);
		} else if (msg[0] == Protocolo.STRING) {
			return Marshaller.unmarshallString(msg);
		} else if (msg[0] == Protocolo.INT_ARRAY) {
			return Marshaller.unmarshallIntArray(msg);
		}

		return msg;
	}

	public void send(byte[] msg) {
		orb.send(msg);
	}

}
