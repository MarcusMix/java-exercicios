package lista_array;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int  [10];
		int i = 0;
		int maior = 0;
		int menor = 0;
		int pos1 = 0;
		int pos2 = 0;
		for(i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número (somente positivos). ");
			valores [i] = teclado.nextInt();
			if(valores[i] <= 0) {
				System.out.println("[ERRO] número inválido digitado!");
				break;
			}else {
				if(valores[i] > maior || maior == 0) {
					maior = valores[i];
					pos1 = i;
				}if(valores[i] < menor || menor == 0) {
					menor = valores[i];
					pos2 = i;
				}
			} 
		}
		System.out.println(maior + " foi o maior número na  " + pos1 + "º posição.");
		System.out.println(menor + " foi o menor número na  " + pos2 + "º posição.");
	
	}
}


