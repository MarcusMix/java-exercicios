package simulado1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double preco = 0;
		double precoTotal = 0;
		double maior = 0;
		double menor = 0;
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite o preço do " + i+ "º componente: ");
			preco = teclado.nextDouble();
			precoTotal += preco;
			
			if (preco > maior || maior == 0) {
				maior = preco;
			} if (preco < menor || menor == 0) {
				menor = preco;
			}
		
		}
		System.out.println("O maior preço dos componentes é: " + maior);
		System.out.println("O menor preço dos componentes é: " + menor);
		teclado.close();
	}

}
		