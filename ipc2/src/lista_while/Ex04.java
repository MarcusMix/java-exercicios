package lista_while;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		for (int i = 0; i < 10; i++) {
    		System.out.println("Digite um n�mero: ");
    		total += entrada.nextDouble();
        }
        System.out.println("m�dia= "+total/10);
	}
} 