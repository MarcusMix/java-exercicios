package lista_array;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] valores = new double [12];
		int i = 0;
		int j = 0;
		double tempTotal = 0;
		double media = 0;
		int contador = 0;
		double maior = 0;
		double menor = 0;
		for(i = 0; i < valores.length; i++) {
			System.out.println("Digite a temperatura do " + (i+1) + "º mes do ano. ");
			valores [i] = teclado.nextDouble();
			tempTotal += valores[i];
		}
		for(j = 0; j < valores.length; j++) {
			media = tempTotal / valores.length;
			if(valores[j] < media) {
				contador ++;
			}if(valores[j] > maior || maior == 0) {
				maior = valores[j];
			}if(valores[j] < menor || menor == 0) {
				menor = valores[j];
			}
		}
		System.out.println("A menor temperatura  do ano foi: " + menor + "°C");
		System.out.println("A maior temperatura  do ano foi: " + maior + "°C");
		System.out.println("A temperatura média do ano foi de: " + media + "°C");
		System.out.println(contador + " mes(es) tiveram a temperatura abaixo da média.");
	}
}


