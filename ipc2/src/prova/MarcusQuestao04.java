package prova;

import java.util.Scanner;

public class MarcusQuestao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite quantos números serão lidos: ");
		int qt = teclado.nextInt();
		int[] numeros = new int[qt];
		calcular(numeros, qt, teclado);
	}

	static void calcular(int[] numeros, int qt, Scanner teclado) {
		double total = 0;
		double media = 0;
		int maior = 0;
		int menor = 0;
		for(int i = 0; i < qt; i++) {
			System.out.println("Digite o valor do " + (i+1) + "º número.");
			numeros[i] = teclado.nextInt();
			total += numeros[i];
			if(numeros[i] > maior || i == 0) {
				maior = numeros[i];
			}if(numeros[i] < menor || i == 0) {
				menor = numeros[i];
			}
			media = total / qt;
		}
		System.out.println("O maior número apresentado foi: " + maior);
		System.out.println("O menor número apresentado foi: " + menor);
		System.out.println("A média dos número apresentados foi: " + media);
	}
}
