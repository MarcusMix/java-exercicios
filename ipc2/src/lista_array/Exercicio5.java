package lista_array;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] valores = new double [10];
		int i = 0;
		int j = 0;
		double notasTotal = 0;
		double media = 0;
		int contador = 0;
		for(i = 0; i < valores.length; i++) {
			System.out.println("Digite a " + (i+1) + "º nota. ");
			valores [i] = teclado.nextInt();
			notasTotal += valores[i];
		}
		for(j = 0; j < valores.length; j++) {
			media = notasTotal / valores.length;
			if(valores[j] > media) {
				contador ++;
			}
		}
		System.out.println("A média da turma foi: " + media);
		System.out.println(contador + " alunos obtiveram nota maior que a média.");
	}
}


