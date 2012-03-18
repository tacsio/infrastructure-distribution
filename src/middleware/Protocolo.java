package middleware;

public interface Protocolo {

	/**
	 * Primeiro byte da mensagem define o tipo de dado <<middleware.orb>>
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
	public static final byte MESSAGE = 9;
	public static final byte INT_ARRAY = 10;
	public static final byte MESSAGE_ARRAY = 11;

	/**
	 * Protocolos utilizados <<middleware.orb>>
	 */
	public static final byte TCP = 0;
	public static final byte UDP = 1;
	public static final byte HTTP = 2;

	/**
	 * Cabeçalho da mensagem <<middleware.message>>
	 */
	public static final byte TIPO = 0;
	public static final byte LENGTH_METODO = 1;
	public static final byte PADDING_PARAMETROS = 2;
	public static final byte LENGTH_PARAMETRO = 0;
	public static final int PADDING = 8;
	
	
	/**
	 * Padrao de enderecamento do servidor de nomes
	 * 
	 * @host: ip da maquina
	 * @porta: porta da em que a maquina vai escutar as requisicoes
	 * @nome_metodo: nome do metodo remoto
	 *  
	 * //[host]:[porta]/[nome_metodo]
	 * 
	 */
}
