package Converter;
import java.util.Scanner;

public class Conversor {
	public int temperatura;
	public int CelsiusToFahrnheit;
	public int FahrnheitToCelsius;
	
	public void Ler() {
		Scanner recebe_temp = new Scanner (System.in);
		System.out.println("Digite a temperatura");
		this.temperatura = recebe_temp.nextInt();
	}
	
	public void Calcula() {
		this.CelsiusToFahrnheit = (this.temperatura * 9/5) + 32;
		this.FahrnheitToCelsius = (this.temperatura - 32) * 5/9;	
	}
	
	public void Escreva() {
		System.out.println(this.temperatura+ "º Celsius Para Fahrnheit é: " + this.CelsiusToFahrnheit);
		System.out.println(this.temperatura+ "º Fahrnheit para Celsius é: " + this.FahrnheitToCelsius);
	}
}
