package lista_variaveis;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o peso em kg do saco de ração");
		double sacoRacao = entrada.nextDouble();
		System.out.println("\n digite a quantidade em gramas consumidas pelo Frajola");
		double frajola = entrada.nextDouble();
		System.out.println("\n digite a quantidade em gramas consumidas pelo Caramelo");
		double caramelo = entrada.nextDouble();
		double pesoGramas = sacoRacao * 1000;
		double consumoRacaoGatos = frajola + caramelo;
		double sobra = pesoGramas - ( 5 * consumoRacaoGatos);
		System.out.println("\n restam " + sobra + " gramas de ração ");


	}

}
