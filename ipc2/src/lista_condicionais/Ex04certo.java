package lista_condicionais;

import java.util.Scanner;

public class Ex04certo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("quantas horas o funcion�rio trabalhou por mes?");
		int horasTrabalhadas = teclado.nextInt();
		System.out.println("qual o sal�rio do funcion�rio por hora trabalhada?");
		double salarioHora = teclado.nextDouble();
		
		int horasExtras = horasTrabalhadas - 160;
		if (horasExtras < 0) {
			horasExtras = 0;
		}
		double valorExtras = horasExtras * (salarioHora * 1.5);
		System.out.println("seu sal�rio no m�s foi: " + ((horasTrabalhadas - horasExtras) * salarioHora + valorExtras));
		
	}

}
