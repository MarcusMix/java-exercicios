package lista_array;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		System.out.println("Matriz A");
		Scanner teclado = new Scanner(System.in);
		int[][] matrizA = new int[3][3];
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				matrizA[i][j] = teclado.nextInt();
			}
		}
		System.out.println("---------------");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-------Matriz A--------");
		
		System.out.println("Matriz B");
		int[][] matrizB = new int[3][3];
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				matrizB[i][j] = teclado.nextInt();
			}
		}
		System.out.println("-------Matriz B--------");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[i].length; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("==================================");
		System.out.println("Matriz resultado: ");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j]+matrizB[i][j] + " ");
			}
			System.out.println();
			teclado.close();
	         }
      }
	          
	        

	       
	
}
	
