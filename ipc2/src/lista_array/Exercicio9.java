package lista_array;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		System.out.println("Matriz A");
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		int maior = 0;
		int menor = 0;
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				matrizA[i][j] = teclado.nextInt();
				if(matrizA[i][j] > maior) {
					maior = matrizA[i][j];
				}if(matrizA[i][j] < menor || i == 0) {
					menor = matrizA[i][j];
				}
			}
		}
		System.out.println("---------------");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("O menor valor da matriz é: " + menor);
		System.out.println("O maior valor da matriz é: " + maior);
		teclado.close();
	    }
}
	          
	        

	       
	

	
