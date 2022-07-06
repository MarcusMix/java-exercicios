package lista_while;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 10.");		
		int numero = entrada.nextInt();	
			if(numero>=1 && numero <=10) {
				System.out.println("Tabuada do número escolhido: ");
				for (int i = 0; i < 10; i++) 
					System.out.println(numero + "x" + (i+1)+ "="+(i+1)*numero);
			}else 
				System.out.println("Número inteiro inválido.\n");
				
		}
} 