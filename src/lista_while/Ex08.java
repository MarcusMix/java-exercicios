package lista_while;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String opcao;
		double media = 0;
		int i = 0;
		do {
			i++;
			System.out.println("Digite o valor da mercadoria");
			double valor = teclado.nextDouble();
			media += valor;
			System.out.println("DESEJA INFORMAR MAIS UMA MERCADORIA? S � SIM N � N�O");
			opcao = teclado.next();
			opcao = opcao.toUpperCase();
		}while(opcao.equals("S"));
		System.out.println("O valor total em estoque �: " + media);
		System.out.println("O valor total em estoque �: " + media / i);	
	}

}
		