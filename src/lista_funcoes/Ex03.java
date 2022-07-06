package lista_funcoes;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double [] notas = new double [3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Digite a " + (i+1) + "º nota: ");
			notas [i] = teclado.nextDouble();
		}
		int opcao = 0;
		System.out.println("1-Calcular média aritmética, 2-Calcular média ponderada.");
		opcao = teclado.nextInt();
		calcularNotas(notas, opcao);
	}
	static void calcularNotas(double [] notas,int opcao) {
		double media = 0;
		double mediac = 0;
		double mediaPonderada = 0;
		double nota1, nota2, nota3;
		if (opcao == 1) {
			for(int i = 0; i < 3; i++) {
				media += notas[i];
				mediac = media / 3;
			}
			System.out.println("A média aritmética das notas é: " + mediac);
		} else if(opcao == 2) {
			nota1 = notas[0] * 5;
			nota2 = notas[1] * 3;
			nota3 = notas[2] * 2;
			mediaPonderada = (nota1 + nota2 + nota3) / 10;
			System.out.println("A média ponderada das notas é: " + mediaPonderada);
		}
		
	}
}



