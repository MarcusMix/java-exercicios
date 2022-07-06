package lista_array;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		System.out.println("Matriz 3x3");
		Scanner teclado = new Scanner(System.in);
		int[][] valores = new int[3][3];
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				valores[i][j] = teclado.nextInt();
			}
		}
		System.out.println("---------------");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println("Digite o um número a ser multiplicado:");
		int numero = teclado.nextInt();
		System.out.println("---------------");
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.print(valores[i][j] * numero + " ");
			}
			System.out.println();
			teclado.close();
		}
	}
}