package prova;

import java.util.Scanner;

public class MarcusQuestao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int [3][3];
		for(int i = 0; i < matriz.length; i++) {
			for(int y = 0; y < matriz.length; y++) {
				System.out.println("[" + i + "]" + "["+ y + "]");
				matriz[i][y] = teclado.nextInt();
			}
		}
		int resultado = calcularMatriz(matriz);
		System.out.println("Matriz formada");
		for(int i = 0; i < matriz.length; i++) {
			for(int y = 0; y < matriz.length; y++) {
				System.out.print(matriz[i][y] + " ");
			}
			System.out.println("");
		}
		System.out.print("Soma da diagonal principal: " + resultado);
		teclado.close();
	}
	
	 static int calcularMatriz(int[][] matriz) {
		 int resultado = 0;
			for(int i = 0; i < matriz.length; i++) {
				for(int y = 0; y < matriz.length; y++) {
				}
			}
		 for(int i = 0; i < matriz.length; i++) {
				for(int y = 0; y < matriz.length; y++) {
					if(i == y) {
						resultado += matriz[i][y];
					}
				}
		 }
		return resultado;
	}
}
 