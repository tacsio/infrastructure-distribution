package middleware;

public interface Protocolo {

	/**
	 * Primeiro byte da mensagem define o tipo de dado 
	 * <<middleware.orb>>
	 */
	public static final byte BOOLEAN = 0;
	public static final byte CHAR = 1;
	public static final byte BYTE = 2;
	public static final byte INT = 3;
	public static final byte SHORT = 4;
	public static final byte LONG = 5;
	public static final byte FLOAT = 6;
	public static final byte DOUBLE = 7;
	public static final byte STRING = 8;

	/**
	 * Protocolos utilizados
	 * <<middleware.orb>>
	 */
	public static final byte TPC = 0;
	public static final byte UDP = 1;
	public static final byte HTTP = 2;
	
	/**
	 * Cabeçalho da mensagem
	 * <<middleware>>
	 */
	public static final byte MESSAGE = 9;
	public static final byte TAMANHO_MENSAGEM = 0;
	
}
