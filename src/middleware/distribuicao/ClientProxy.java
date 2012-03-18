package middleware.distribuicao;

import apps.IDL;

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
	public int convertKelvinToCelsius(int temperatura, String ad, float f) {
		int retorno = requestor.invoke("KelvinToCelsius", temperatura, ad,f);
		return retorno;
	}

}
