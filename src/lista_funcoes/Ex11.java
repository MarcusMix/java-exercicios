package lista_funcoes;

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int [5];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite o " + (i+1) + "° número: ");
			numeros[i] = entrada.nextInt();
		}
		int opcao = 0;
		Arrays.sort(numeros);
		System.out.println("1- crescente, 2 - decrescente");
		opcao = entrada.nextInt();
		if(opcao == 1) {
			crescente(numeros);
		} else {
			decrescente(numeros);
		}
		
		
	}

	 static void decrescente(int[] numeros) {
		 for(int i = (numeros.length -1); i > 0; i--) {
			 System.out.println(numeros[i]);
		 }
	}

	 static void crescente(int[] numeros) {
		 for(int i = 0; i < numeros.length; i++) {
			 System.out.println(numeros[i]);
		 }
		 
	}

}
