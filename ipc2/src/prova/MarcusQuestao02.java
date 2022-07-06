package prova;

import java.util.Scanner;

public class MarcusQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor que você comprará a placa: ");
		double valor = teclado.nextDouble();
		if(valor <= 2000) {
			System.out.println("Placa indicada: RTX 2070");
		}else if(valor > 2000 && valor <= 5000) {
			System.out.println("Placa indicada: RTX 3060");
		} else {
			System.out.println("Placa indicada: RTX 3080");
		}
		teclado.close();
	}
}
