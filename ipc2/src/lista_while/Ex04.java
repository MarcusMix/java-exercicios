package lista_while;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total = 0;
		for (int i = 0; i < 10; i++) {
    		System.out.println("Digite um número: ");
    		total += entrada.nextDouble();
        }
        System.out.println("média= "+total/10);
	}
} 