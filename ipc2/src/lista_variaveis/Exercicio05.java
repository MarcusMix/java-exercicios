package lista_variaveis;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero inteiro: ");
		int numero = entrada.nextInt();
		int antecessor = numero -1;
		int sucessor = numero +1;
		System.out.println("\n o numero antecessor é: " + antecessor);
		System.out.println("\n o numero sucessor é: " + sucessor);
		

	}

}
