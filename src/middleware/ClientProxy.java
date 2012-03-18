package middleware;

import apps.IDL;

public class ClientProxy implements IDL {

	private Requestor requestor;

	public ClientProxy() {
		requestor = new Requestor();
	}

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		int retorno = requestor.invoke(1, temperatura);
		return retorno;
	}

	@Override
	public int convertKelvinToCelsius(int temperatura) {
		int retorno = requestor.invoke(2, temperatura);
		return retorno;
	}

}
