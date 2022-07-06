package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("0.0");
		Scanner teclado = new Scanner(System.in);
		System.out.println("digita a primeira nota");
		double nota1 = teclado.nextDouble();
		System.out.println("digita a segunda  nota");
		double nota2 = teclado.nextDouble();
		double media = (nota1 + nota2) / 2 ;
		if(media >=7) {
			System.out.println("Aprovado " + formatador.format(media));
		} else {
			System.out.println("Reprovado " + formatador.format(media));
		}
	}

}
