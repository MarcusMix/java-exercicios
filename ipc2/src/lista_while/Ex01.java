package lista_while;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = entrada.nextInt();
		int num2;
		do {
			System.out.println("Digite o segundo número: ");		
			num2 = entrada.nextInt();
			if (num2 == 0)
				System.out.println("\nDigite um número válido. ");
		} while (num2 == 0);
		
		int resultado = num1 / num2;
		System.out.println("O resultado é: " + resultado);
	}

}
		