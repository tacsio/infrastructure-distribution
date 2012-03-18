package middleware.util;

public class Configuracao {

	private String host;
	private int port;
	private byte protocol;

	public Configuracao(String host, int port, byte protocol) {
		this.host = host;
		this.port = port;
		this.protocol = protocol;
	}

	public Configuracao() {
	
	}
	
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public byte getProtocol() {
		return protocol;
	}

	public void setProtocol(byte protocol) {
		this.protocol = protocol;
	}

}
