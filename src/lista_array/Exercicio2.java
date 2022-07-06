package lista_array;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int [10];
		int j = 0;
		boolean gps = false;
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º numero: ");
			valores [i] = teclado.nextInt();
		}
		System.out.println("Digite um numero: ");
		int numero = teclado.nextInt();
		for(j = 0; j < valores.length; j++) {
			if(numero == valores[j]) {
				gps = true;
			}
		}if(gps) {
			System.out.println("Achei.");
		}else {
			System.out.println("Não achei.");
		}
	}

}
