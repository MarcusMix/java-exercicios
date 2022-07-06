package lista_funcoes;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);

			System.out.println("Matriz 3x3");
			int[][] matrizA = new int[3][3];
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA.length; j++) {
					System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
					matrizA[i][j] = teclado.nextInt();
				}
			}
			menorElemento(matrizA);
		}

		static void menorElemento(int[][] matrizA) {
			int menor = matrizA[0][0];
			int linha = 0;
			int coluna = 0;
			for (int i = 0; i < matrizA.length; i++) {
				for (int j = 0; j < matrizA[i].length; j++) {
					if (matrizA[i][j] < menor) {
						menor = matrizA[i][j];
						linha = i;
						coluna = j;
					}
				}
			}
			System.out.println("O menor elemento da matriz é: " + menor);
			System.out.println("A posição do menor elemento esta na linha: " + linha + " coluna: " + coluna);
	}
}
