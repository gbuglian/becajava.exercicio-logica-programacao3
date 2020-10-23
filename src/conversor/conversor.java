package conversor;

import java.util.Scanner;

public class conversor {

	public static void main(String[] args) {

		Scanner recebe_opcao = new Scanner(System.in);
		Scanner recebe_celsius = new Scanner(System.in);
		Scanner recebe_fahrenheit = new Scanner(System.in);

		int opcao = 0;

		while (opcao != 1 && opcao != 2) {

			System.out.println("Iremos fazer uma conversão, digite '1' para fazer a conversão de celsius para fahrenheit ou '2' para fazer a conversão de fahrenheit para celsius");
			opcao = recebe_opcao.nextInt();

			if (opcao == 1) {
				System.out.println("Digite a quantidade de graus em celsius: ");
				int celsius = recebe_celsius.nextInt();
				int celsiusToFahrenhint = (celsius * 9 / 5) + 32;
				System.out.println(celsius + " celsius em fahrenheit é " + celsiusToFahrenhint);
			} else if (opcao == 2) {
				System.out.println("Digite a quantidade de graus em fahrenheit: ");
				int fahrenheit = recebe_fahrenheit.nextInt();
				int FahrenhintTocelsius = (fahrenheit - 32) * 5 / 9;
				System.out.println(fahrenheit + " fahrenheit em celsius é " + FahrenhintTocelsius);
			} else {
				System.out.println("Opção inválida");
			}
		}

	}

}
