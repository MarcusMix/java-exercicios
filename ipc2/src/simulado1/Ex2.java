package simulado1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("R$0.00");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Quantas caixas do medicamento você irá levar?");
		int qtMedicamento = teclado.nextInt();
		double valor = qtMedicamento * 50;
		if(valor < 20000) {
			System.out.println("O valor de " + qtMedicamento + " unidades do medicamento ficará: " + df.format(qtMedicamento * 47.5));
		} if(valor > 20000 && valor < 50000) {
			System.out.println("O valor de " + qtMedicamento + " unidades do medicamento ficará: " + df.format(qtMedicamento * 45));
		} else {
			System.out.println("O valor de " + qtMedicamento + " unidades do medicamento ficará: " + df.format(qtMedicamento * 42.5));
		}
		teclado.close();
	}

}
		