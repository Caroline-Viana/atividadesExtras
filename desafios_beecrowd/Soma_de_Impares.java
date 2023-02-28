package desafios_beecrowd;

import java.util.Scanner;

public class Soma_de_Impares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		int impares = 0;
		
		System.out.println("Digite o 1° número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o 2° número: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for (int contador = n1 + 1; contador < n2; contador++) {
				if (contador % 2 != 0) {
					impares += contador;
					}
			}
		}else {
			for (int contador = n2 + 1; contador < n1; contador++) {
				if (contador % 2 != 0) {
					impares += contador;
					
				}
			}
		}
		System.out.println(impares);
		leia.close();
		
	}

}
