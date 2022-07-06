package lista_condicionais;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int codigoA = 12345;
		int senha = 54321;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o código de acesso?");
		int codigoD = teclado.nextInt();
		if (codigoA == codigoD)
			System.out.println("Qual a sua senha de acesso?");
		int senhaD = teclado.nextInt();
		if (senha == senhaD)
			System.out.println("Acesso permitido!");
		if (codigoA != codigoD)
			System.out.println("Usuário inválido!");
		if (senha != senhaD)
			System.out.println("Senha inválida");
	}

}
