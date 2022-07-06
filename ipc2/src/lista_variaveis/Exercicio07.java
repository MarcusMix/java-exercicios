package lista_variaveis;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite votos brancos :");
		int votoBranco = teclado.nextInt();
		System.out.println("digite votos nulos :");
		int votoNulo = teclado.nextInt();
		System.out.println("digite votos válidos :");
		int votoValido = teclado.nextInt();

		int votoTotal = (votoBranco + votoNulo + votoValido);
		
		System.out.println("O total de votos foi: " + votoTotal);

		int percentualBranco = (votoTotal / votoBranco);
		System.out.println("percentual brancos:" + percentualBranco + "%");


		int percentualNulo = (votoTotal / votoNulo);
		System.out.println("percentual nulos:" + percentualNulo + "%");

		int percentualValido = (votoTotal / votoValido);
		System.out.println("percentual validos: " + percentualValido + "%");

	}

}
