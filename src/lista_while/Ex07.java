package lista_while;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o n�mero total de mercadorias");
		int mercadorias = entrada.nextInt();
		double contador = 0;
		for(int i = 1; i <= mercadorias; i++) {
		System.out.println("Digite o valor de cada mercadoria");
		double valor = entrada.nextDouble();
		contador += valor;
		}
		System.out.println("O valor total no estoque � " + contador);
		System.out.println("A m�dia do valor das mercadorias �: " + (contador / mercadorias));
	}

}
		