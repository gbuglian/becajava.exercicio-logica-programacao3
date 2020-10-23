package conversao_poo;

public class Conversao {

	public double celsius;
	public double fahrenheit;

	public double FahrenhintTocelsius (double fahrenheit ) {
		double FahrenhintTocelsius = (fahrenheit - 32) * 5 / 9;
		return FahrenhintTocelsius;
	}
	
	public double celsiusToFahrenhint (double Celsius ) {
		double celsiusToFahrenhint = (celsius * 9 / 5) + 32;
		return celsiusToFahrenhint;
	}
}