package lista_variaveis;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	 Scanner entrada = new Scanner(System.in);
	 System.out.println("\n digite o dia do seu nascimento: ");
	 int dia = entrada.nextInt();
	 System.out.println("\n Digite o mês do seu nascimento:");
	 int mes = entrada.nextInt();
	 System.out.println("\n Digite o ano do seu nascimento");
	 int ano = entrada.nextInt();
	 int diaEmDia = dia;
	 int mesEmDia = mes * 30;
	 int anosEmDia = (ano - 2022) * 365;
	 int diaTotal = (dia + mesEmDia + anosEmDia);
	 System.out.println("\n Sua idade em dias é: " + diaTotal);

	}

}
