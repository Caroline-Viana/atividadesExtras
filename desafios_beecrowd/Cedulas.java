package desafios_beecrowd;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valor, nota50, nota100, nota20, nota10, nota5, nota2, nota1;
		
		System.out.println("Digite o valor: ");
		valor = leia.nextInt();
		
		nota100 = valor / 100;
		nota50 = (valor % 100) / 50;
		nota20 = ((valor % 100) % 50) / 20;
		nota10 = (((valor % 100) % 50) % 20) / 10;
		nota5 = ((((valor % 100) % 50) % 20) % 10) / 5;
		nota2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
		nota1 = (((((valor % 100) % 50) % 20) % 10) % 5) % 2;
		
		System.out.println(valor);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
	}
}