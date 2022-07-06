package lista_condicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("quantas horas o funcionário trabalhou por semana?");
		int horasTrabalhadas = teclado.nextInt();
		System.out.println("quantas horas extra o funcionário fez?");
		int horasExtras = teclado.nextInt();
		System.out.println("qual o salário do funcionário por hora trabalhada?");
		double salarioHora = teclado.nextDouble();
		double horasExtrasValor = (salarioHora * 1.5);
		int horasTotais = horasTrabalhadas + horasExtras;
		int horasMes = horasTrabalhadas * 4;
		double valorExtras = horasExtras * horasExtrasValor;
		if (horasExtras == 0 ) {
			System.out.println("o funcionário trabalhou por " + (horasTrabalhadas * 4) + " horas esse mes");
			System.out.println("seu salário por cada hora trabalhada foi " + ((horasTrabalhadas * 4) * salarioHora + valorExtras) / horasMes);
			System.out.println("o salário total foi de: " + ((horasTrabalhadas * 4) * salarioHora));
			
		} else {
			System.out.println("o funcionário trabalhou por " + ((horasTrabalhadas * 4) + horasExtras) + " horas esse mes");
			System.out.println("seu salário por cada hora trabalhada foi " + (horasMes * salarioHora + valorExtras ) / (horasMes + horasExtras));
			System.out.println("o salário total foi de: " + ((horasTrabalhadas * 4) * salarioHora + valorExtras));
		}
		
	}

}
