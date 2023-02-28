package desafios_beecrowd;

import java.util.Scanner;

public class Quadrado_de_Pares {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double numero;
		double raiz = 0;
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		for(int contador = 1; contador <= numero; contador++) {
			if(contador % 2 == 0) {
				raiz = Math.pow(contador, 2);
				System.out.println(contador + " ^ + 2 = " + raiz);
			}
		}
		
		leia.close();
	}

}
