package conversao_poo;

public class Main {
	

	public static void main(String[] args) {
		Conversao converte = new Conversao();
		converte.celsius = 30;
		converte.fahrenheit = 86;
		
		double celsius = 30;
		double fahrenheit = 86;
		double celsiusToFahrenhint = converte.celsiusToFahrenhint(celsius);
		double FahrenhintTocelsius = converte.FahrenhintTocelsius(fahrenheit);
		
		System.out.println(celsius +"� celsius em fahrenheit �: " +celsiusToFahrenhint);
		System.out.println(fahrenheit +"� fahrenheit em celsius �: " +FahrenhintTocelsius);
			
	}
}