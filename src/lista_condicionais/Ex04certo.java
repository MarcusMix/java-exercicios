package lista_condicionais;

import java.util.Scanner;

public class Ex04certo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("quantas horas o funcionário trabalhou por mes?");
		int horasTrabalhadas = teclado.nextInt();
		System.out.println("qual o salário do funcionário por hora trabalhada?");
		double salarioHora = teclado.nextDouble();
		
		int horasExtras = horasTrabalhadas - 160;
		if (horasExtras < 0) {
			horasExtras = 0;
		}
		double valorExtras = horasExtras * (salarioHora * 1.5);
		System.out.println("seu salário no mês foi: " + ((horasTrabalhadas - horasExtras) * salarioHora + valorExtras));
		
	}

}
