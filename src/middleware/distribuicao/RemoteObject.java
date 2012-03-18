package middleware.distribuicao;

import apps.IDL;

//Remote Object
public class RemoteObject implements IDL {

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		return temperatura + 273;
	}

	@Override
	public int convertKelvinToCelsius(int temperatura, String ad, float f) {
		System.out.println(ad);
		System.out.println(f);
		return temperatura - 273;
	}

}
