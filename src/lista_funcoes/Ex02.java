package lista_funcoes;

import java.util.Scanner;

public class Ex02 {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			int pontos = 0;
			System.out.println("Informe os pontos do aluno: ");
			pontos = teclado.nextInt();
			pontuacao(pontos);
		}
	static void pontuacao(int pontos) {
		
		if(pontos <= 60) {
			System.out.println("Insatisfatório");
		}else if (pontos >= 61 && pontos <= 75) {
			System.out.println("Satisfatório");
		}else if(pontos >= 76 && pontos < 90) {
			System.out.println("Bom");
		} else {
			System.out.println("Ótimo");
		}
	}
}
