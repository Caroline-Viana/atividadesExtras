package desafios_beecrowd;

import java.util.Scanner;

public class Selecao_em_Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[100];
		
		
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetor[indice] = leia.nextInt();
		}
		
		for(int contador = 0; contador < vetor.length; contador++) {
			if(vetor[contador] <= 10) {
				System.out.println("A[" + contador + "] = " + vetor[contador]);
			}
			
		}
	}

}
