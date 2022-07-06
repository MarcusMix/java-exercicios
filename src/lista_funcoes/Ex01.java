package lista_funcoes;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int idade = 0;
		System.out.print("Informe a idade do nadador: ");
		idade = teclado.nextInt();
		categoria(idade);
	}

		static void categoria(int idade) {
		if(idade <= 10) {
			System.out.println("Categoria Mirim");
		}else if (idade >= 11 && idade <=14) {
			System.out.println("Categoria Infantil");
		}else if(idade >=15 && idade < 19) {
			System.out.println("Categoria Juvenil");
		} else {
			System.out.println("Categoria Adulto");
		}
	}

}
