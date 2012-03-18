package middleware.orb;

public interface ORB {

	public void send(byte[] msg);
	public byte[] receive();

}
