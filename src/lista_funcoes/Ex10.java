package lista_funcoes;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Defina a quantidade de números a serem lidos. ");
		int qt = entrada.nextInt();
		int[] numeros = new int [qt];
		
		calculadora(numeros, qt);
		
		}
	static void calculadora(int[] numeros, int qt) {
		Scanner entrada = new Scanner(System.in);
		int media = 0;
		int maior = 0;
		int menor = 0;
	 for(int i = 0; i < qt; i++) {
			System.out.println("Digite o " + (i+1) + " ° número: ");
			numeros[i]  = entrada.nextInt();
			
			media += numeros[i];
			
			if(numeros[i] > maior  || i == 0) {
				maior = numeros[i];
			} 
			if(numeros[i] < menor  || i == 0) {
				menor = numeros[i];
			}
		}
		System.out.println(menor);
		System.out.println(maior);
		System.out.println((media / qt));
	}

}
