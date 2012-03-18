package apps;

import middleware.distribuicao.ClientProxy;

public class Aplicacao implements IDL {

	private ClientProxy requestor;

	public Aplicacao() {
		requestor = new ClientProxy();
	}

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		return requestor.convertCelsiusToKelvin(temperatura);
	}

	@Override
	public int convertKelvinToCelsius(int temperatura, String ad, float f) {
		return requestor.convertKelvinToCelsius(temperatura,ad, f);
	}

	public static void main(String[] args) {
		Aplicacao app = new Aplicacao();
		System.out.println(app.convertKelvinToCelsius(100, "teste", 3));
	}
}
