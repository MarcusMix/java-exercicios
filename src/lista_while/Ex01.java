package lista_while;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num1 = entrada.nextInt();
		int num2;
		do {
			System.out.println("Digite o segundo n�mero: ");		
			num2 = entrada.nextInt();
			if (num2 == 0)
				System.out.println("\nDigite um n�mero v�lido. ");
		} while (num2 == 0);
		
		int resultado = num1 / num2;
		System.out.println("O resultado �: " + resultado);
	}

}
		