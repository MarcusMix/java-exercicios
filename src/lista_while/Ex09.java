package lista_while;
		
import java.util.Scanner;
		
		public class Ex09 {
		public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a quantidade de números: ");
		int quantidade = teclado.nextInt();
		double acumulador = 0;
		double maior = 0;
		double menor = 0;
			for(int i = 0; i < quantidade; i ++) {
				System.out.println("Informe o número: ");
				double valor = teclado.nextDouble();
				acumulador += valor;
					if(valor < maior || i == 0) {
						maior = valor;
					}
					if(valor < menor || i == 0) {
							menor = valor;
					}
			}
		double media = acumulador / quantidade;
		System.out.println("Média dos números é: " + media);
		System.out.println("Maior dos números é: " + maior);
		System.out.println("Menor dos números é: " + menor);
		}
}
	