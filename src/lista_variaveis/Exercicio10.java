package lista_variaveis;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
				 System.out.println("\ninforme o numero de carros vendidos");
				 int qtdeCarrosVendidos = teclado.nextInt();
				 System.out.println("\n informe o total de R$ das vendas:");
				 double totalVendas = teclado.nextDouble(); 
				 System.out.println("\n informe o salario:");
				 double salario = teclado.nextDouble();
				 System.out.println("\n informe o valor R$ da comissão fixa:");
				 double comissao = teclado.nextDouble();
				 double salarioFinal = salario + (qtdeCarrosVendidos * comissao) + (totalVendas * 0.05);
				 System.out.println("\n o salario final do vendedor é " + salarioFinal);

	}

}
