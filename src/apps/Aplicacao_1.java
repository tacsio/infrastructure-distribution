package apps;

import middleware.ClientProxy;

public class Aplicacao_1 implements IDL {

	private ClientProxy requestor;

	public Aplicacao_1() {
		requestor = new ClientProxy();
	}

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		return requestor.convertCelsiusToKelvin(temperatura);
	}

	@Override
	public int convertKelvinToCelsius(int temperatura) {
		return requestor.convertKelvinToCelsius(temperatura);
	}

	public static void main(String[] args) {
		Aplicacao_1 app = new Aplicacao_1();
		System.out.println(app.convertCelsiusToKelvin(-343));
	}
}
