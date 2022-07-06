package lista_funcoes;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Matriz 4x4");
		int[][] valores = new int[4][4];
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				valores[i][j] = teclado.nextInt();
				}
			}
		int valorSoma = calcularSoma(valores);
		System.out.println("A soma da diagonal principal é: " + valorSoma);
	}
	static int calcularSoma(int[][]valores){
	int soma = 0;
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				if(i==j) {
					soma += valores [i][j];
				}
			}
		}
		return soma;
	}
}
