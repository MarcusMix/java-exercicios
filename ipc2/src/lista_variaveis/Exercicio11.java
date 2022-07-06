package lista_variaveis;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("digite o primeiro nota");
		double nota1 = entrada.nextDouble();
		System.out.print("\n digite a segunda nota");
		double nota2 = entrada.nextDouble();
		System.out.print("\n digite a terceira nota");
		double nota3 = entrada.nextDouble();
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		System.out.print("\n a media ponderada é " + media);


	}

}
