package lista_condicionais;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("que horas o jogo comecou?");
		int inicio = teclado.nextInt();
		System.out.println("que horas o jogo acabou?");
		int acabou = teclado.nextInt();
		
		int horasTotal = (acabou - inicio);
		
		if (horasTotal == 0 || horasTotal > 24) {
			System.out.println("impossivel durar mais que 24 horas");
		} if (horasTotal < 0) {
			System.out.println("o jogo durou " + (horasTotal + 24) +  " horas.");
		} if(horasTotal > 1) {
			System.out.println("o jogo durou " + horasTotal + " horas.");
		}
		teclado.close();
	}

}
  