package lista_array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9mais1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] valores = new int  [10];
		int i = 0;
		for(i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º número. ");
			valores [i] = teclado.nextInt();
				}
		Arrays.sort(valores);
		for(int j = 0; j < valores.length; j++ ) {
		System.out.println(valores[j] + " ");
		}
		
	
	}
}



