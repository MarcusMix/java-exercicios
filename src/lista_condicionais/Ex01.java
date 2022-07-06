package lista_condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");
		System.out.println("quantas maças voce vai levar?");
		double maca = teclado.nextInt();
		if(maca <= 11) {
			System.out.println("o valor ficará R$" + formatador.format(maca * 1.3));
		} else {
			System.out.println("o valor ficará R$" + formatador.format(maca * 1.0));
		}
	}

}
