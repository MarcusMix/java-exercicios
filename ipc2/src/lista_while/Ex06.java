package lista_while;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 10; i++) {
    		System.out.println("Digite um número: ");
    		int n = entrada.nextInt();
    		if(n % 2==0) {
    			count+= 1;
    		}
        }
        System.out.println("números pares: "+count);

	}

}
