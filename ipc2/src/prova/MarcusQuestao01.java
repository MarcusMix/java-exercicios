package prova;

import java.util.Scanner;

public class MarcusQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] valores = new double[10];
		double total = 0;
		double media = 0;
		int contador = 0;
		for(int y = 0; y < valores.length; y++) {
			System.out.println("Digite a " + (y+1) +  "� notas obtida: ");
			valores[y] = teclado.nextDouble();
			total += valores[y];
		}
		for(int y = 0; y < valores.length; y++) {
			media = total / 10;
			if(valores[y] > media) {
				contador++;
			}
		}
		System.out.println("A m�dia das notas �: " + media);
		System.out.println(contador + " notas ficaram a cima da m�dia.");
		teclado.close();
	}
}
