package simulado1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		DecimalFormat formatador = new DecimalFormat("R$0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor de custo do medicamento: ");
		double custo = teclado.nextDouble();
		double imposto = custo * 0.5;
		double lucro = 1.5;
		double valorFinal = (custo + imposto) * lucro;
		System.out.println("O valor do medicamento será: " + formatador.format(valorFinal));
		teclado.close();
	}

}
		