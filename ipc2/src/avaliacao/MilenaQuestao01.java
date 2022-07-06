package avaliacao;

import java.util.Scanner;

public class MilenaQuestao01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double media = 0;
		int[] valores = new int [10];
		double nota = 0;
		double contador = media;
		for(int i = 0; i < valores.length; i++) {
			System.out.println("Digite a nota: ");
			valores [i] = teclado.nextInt();
			media += valores[i];
			
	} if(nota > media) {
		contador ++;
		
	}
	System.out.println("A média das notas é : " + media / nota );
	System.out.println("Quantidade de notas que ficaram acima da média :" + contador);
			
	}		
		
}
	

