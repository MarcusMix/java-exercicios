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
			System.out.println("Digite o pre�o do " + qtProduto + "� componente: ");
			preco = teclado.nextDouble();
			
			precoTotal += preco;
			
			if (preco > maior || maior == 0) {
				maior = preco;
			} if (preco < menor || menor == 0) {
				menor = preco;
			}	
			System.out.println("DESEJA INFORMAR MAIS UM COMPONENTE? 1 � SIM, 2 � N�O.");
			opcao = teclado.nextInt();
		}while(opcao == 1);
		double media = precoTotal / qtProduto;
		System.out.println("A quantidade de componentes informados foi: " + qtProduto);	
		System.out.println("A m�dia em R$ dos componentes �: " + df.format(media));	
		System.out.println("O maior pre�o dos componentes �: " + maior);
		System.out.println("O menor pre�o dos componentes �: " + menor);
	}

}
		