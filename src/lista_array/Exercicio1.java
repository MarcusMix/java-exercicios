package lista_array;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] valores = new String [10];
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite o " + (i+1) + "º nome: ");
			valores [i] = teclado.next();
		}
		for(int j = 0; j < valores.length; j++ ) {
			System.out.println(valores[j]);
  
		}																			
		System.out.println("-----------------");
		for(int k = valores.length; k > 0 ; k--) {
			System.out.println(valores[k-1]);
	}			

}
}
