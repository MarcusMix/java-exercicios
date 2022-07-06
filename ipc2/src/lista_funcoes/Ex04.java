package lista_funcoes;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Matriz 3x4");
		int[][] valores = new int[3][4];
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.println("Informe o valor da posição [" + i + "][" + j + "]:");
				valores[i][j] = teclado.nextInt();
			}
		}
		int quantidadePares = calcularPar(valores);
		System.out.println("Quantidade de pares: " + quantidadePares);
		}
		static int calcularPar(int[][]valores){
			int par = 0;
			for (int i = 0; i < valores.length; i++) {
				for (int j = 0; j < valores[i].length; j++) {
					if(valores[i][j] % 2 == 0) {
						par++;
					}
				}
			}
		return par;
		}

}
