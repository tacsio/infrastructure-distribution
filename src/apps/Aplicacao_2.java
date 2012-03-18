package apps;

//Remote Object
public class Aplicacao_2 implements IDL {

	@Override
	public int convertCelsiusToKelvin(int temperatura) {
		return temperatura + 273;
	}

	@Override
	public int convertKelvinToCelsius(int temperatura) {
		return temperatura - 273;
	}

}
