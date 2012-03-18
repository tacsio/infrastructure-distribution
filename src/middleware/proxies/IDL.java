package middleware.proxies;

public interface IDL {

	public int convertCelsiusToKelvin(int temperatura);

	public int convertKelvinToCelsius(int temperatura);
	
	public int[] ord(int[] list);

}
