package lista_variaveis;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite o salario atual ");

		double salarioAtual = teclado.nextDouble();
		System.out.println("seu salario atual é: " + salarioAtual);

		System.out.println("\n digite o percentual de data base: ");
		double dataBase = teclado.nextDouble();

		double salarioNovo = (salarioAtual * dataBase) + salarioAtual;
		System.out.println("\n seu novo salario é: " + salarioNovo);

	}

}
