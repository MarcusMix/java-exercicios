package lista_funcoes;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			boolean primo = calcularPrimos(i);
			if (primo) {
				System.out.println("O número " + i + " é primo.");
			}
		}
	}
	static boolean calcularPrimos(int numero) {
		boolean resultado = true;
		if (numero % 2 == 0 && numero != 2) {
			resultado = false;
		}
		if (numero % 3 == 0 && numero != 3) {
			resultado = false;
		}
		if (numero % 5 == 0 && numero != 5) {
			resultado = false;
		}
		if (numero % 7 == 0 && numero != 7) {
			resultado = false;
		}
	return resultado;
	}
}

