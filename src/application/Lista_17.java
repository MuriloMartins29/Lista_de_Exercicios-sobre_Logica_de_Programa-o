package application;

public class Lista_17 {

	public static String converterFahrenheitCelsius(double fahrenheit) {
		double celsius = (5 * (fahrenheit - 32)) / 9;
		return String.format("Fahrenheit: %.1f°F\nCelsius: %.1f°C", fahrenheit, celsius);
	}

}
