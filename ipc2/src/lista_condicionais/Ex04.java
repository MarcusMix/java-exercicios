package lista_condicionais;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("quantas horas o funcion�rio trabalhou por semana?");
		int horasTrabalhadas = teclado.nextInt();
		System.out.println("quantas horas extra o funcion�rio fez?");
		int horasExtras = teclado.nextInt();
		System.out.println("qual o sal�rio do funcion�rio por hora trabalhada?");
		double salarioHora = teclado.nextDouble();
		double horasExtrasValor = (salarioHora * 1.5);
		int horasTotais = horasTrabalhadas + horasExtras;
		int horasMes = horasTrabalhadas * 4;
		double valorExtras = horasExtras * horasExtrasValor;
		if (horasExtras == 0 ) {
			System.out.println("o funcion�rio trabalhou por " + (horasTrabalhadas * 4) + " horas esse mes");
			System.out.println("seu sal�rio por cada hora trabalhada foi " + ((horasTrabalhadas * 4) * salarioHora + valorExtras) / horasMes);
			System.out.println("o sal�rio total foi de: " + ((horasTrabalhadas * 4) * salarioHora));
			
		} else {
			System.out.println("o funcion�rio trabalhou por " + ((horasTrabalhadas * 4) + horasExtras) + " horas esse mes");
			System.out.println("seu sal�rio por cada hora trabalhada foi " + (horasMes * salarioHora + valorExtras ) / (horasMes + horasExtras));
			System.out.println("o sal�rio total foi de: " + ((horasTrabalhadas * 4) * salarioHora + valorExtras));
		}
		
	}

}
