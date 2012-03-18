package middleware.proxies;

import middleware.distribuicao.Requestor;

public class ClientProxy implements IDL {

	private Requestor requestor;

	public ClientProxy() {
		requestor = new Requestor();
	}

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		int retorno = requestor.invoke("CelsiusToKelvin", temperatura);
		return retorno;
	}

	@Override
	public int convertKelvinToCelsius(int temperatura) {
		int retorno = requestor.invoke("KelvinToCelsius", temperatura);
		return retorno;
	}

	@Override
	public int[] ord(int[] list) {
		int[] retorno = requestor.invoke("Ord", list);
		return retorno;
	}

}
