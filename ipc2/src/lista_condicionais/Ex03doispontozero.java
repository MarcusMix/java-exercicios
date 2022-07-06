package lista_condicionais;

import java.util.Scanner;

public class Ex03doispontozero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite que horas o jogo de Xadrez iniciou: ");
		int inicio = teclado.nextInt();
		System.out.println("Digite que horas o jogo de Xadrez terminou: ");
		int terminou = teclado.nextInt();

		int horastotal = (terminou - inicio);

		if (horastotal < 0) {
			System.out.println("A quantidade de horas de jogo foi de: " + (horastotal + 24));
		}
		if (horastotal > 0) {
			System.out.println("A quantidade de horas do jogo foi de: " + horastotal);
		}
		if (horastotal == 0) {
			System.out.println("A quantidade de horas de jogo foi de: " + (horastotal + 24));
		}
		teclado.close();
	}
}