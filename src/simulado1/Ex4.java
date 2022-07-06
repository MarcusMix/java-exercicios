package simulado1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$0.00");
		double preco = 0;
		double precoTotal = 0;
		double maior = 0;
		double menor = 0;
		int opcao = 0;
		int qtProduto = 0;
		do {
			qtProduto++;
			System.out.println("Digite o preço do " + qtProduto + "º componente: ");
			preco = teclado.nextDouble();
			
			precoTotal += preco;
			
			if (preco > maior || maior == 0) {
				maior = preco;
			} if (preco < menor || menor == 0) {
				menor = preco;
			}	
			System.out.println("DESEJA INFORMAR MAIS UM COMPONENTE? 1 – SIM, 2 – NÃO.");
			opcao = teclado.nextInt();
		}while(opcao == 1);
		double media = precoTotal / qtProduto;
		System.out.println("A quantidade de componentes informados foi: " + qtProduto);	
		System.out.println("A média em R$ dos componentes é: " + df.format(media));	
		System.out.println("O maior preço dos componentes é: " + maior);
		System.out.println("O menor preço dos componentes é: " + menor);
	}

}
		