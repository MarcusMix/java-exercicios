package lista_variaveis;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o modelo do carro:" );
		String modelo = teclado.nextLine();
		System.out.println("\n Informe o valor do custo de fábrica");
		double custoFabrica = teclado.nextDouble();
		double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);
		System.out.println("\n Modelo: " + modelo);
		System.out.println("\n Custo final do carro : " + custoFinal);

	}

}