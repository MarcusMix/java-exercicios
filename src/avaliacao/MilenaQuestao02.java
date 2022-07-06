package avaliacao;

import java.util.Scanner;

public class MilenaQuestao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Informe o valor que possui: ");
		int valor = teclado.nextInt();
		if(valor <= 2000) {
			System.out.println("Placa indicada: RTX 2070.");
		}if(valor > 2000 && valor <= 5000) {
			System.out.println("Placa indicada: RTX 3060. ");
		}if(valor > 5000) {
			System.out.println("Placa indicada: RTX 3080. ");
		}
		

	}

}
