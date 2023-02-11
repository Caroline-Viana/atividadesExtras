package desafios_beecrowd;

import java.util.Scanner;

public class Conversao_de_tempo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		int horas;
		int minutos;
		int segundos;

		System.out.print("Digite um número: ");
		numero = leia.nextInt();

		horas = numero / 3600;
		minutos = (numero % 3600) / 60;
		segundos = ((numero % 3600) % 60);

		System.out.print(horas + ":" + minutos + ":" + segundos);

	}

}
