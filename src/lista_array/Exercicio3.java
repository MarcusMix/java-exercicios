package lista_array;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int  [10];
		int contador = 0;
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			valores [i] = teclado.nextInt();
		}
		System.out.println("Digite um numero: ");
		int numero = teclado.nextInt();
		for(int j = 0; j < valores.length; j++) {
			if(numero == valores[j]) {
				contador++;
			}
		}
		System.out.println("O número digitado apareceu " +contador+ " vezes.");
	
	}

}
