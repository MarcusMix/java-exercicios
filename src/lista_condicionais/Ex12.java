package lista_condicionais;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual nome do funcion�rio?");
		String nome = teclado.next();
		System.out.println("Digite a data de nascimento");
		int nascimento = teclado.nextInt();
		System.out.println("Ano em que " + nome + " entrou na empresa");
		int entradaE = teclado.nextInt();
		int idade = 2022 - nascimento;
		int AnosServico = 2022  - entradaE;
		
		
	
		
		if (idade >= 65)
			System.out.println("O funcion�rio " + nome +"com " + idade +" de idade e " + AnosServico + " anos de servi�o. REQUERER APOSENTADORIA");
		else if (AnosServico >= 30)
			System.out.println("O funcion�rio " + nome +"com " + idade +" de idade e " + AnosServico + " anos de servi�o. REQUERER APOSENTADORIA");
		else if (idade >= 60 && AnosServico > 25)
			System.out.println("O funcion�rio " + nome +"com " + idade +" de idade e " + AnosServico + " anos de servi�o. REQUERER APOSENTADORIA");
		else 
			System.out.println("O funcion�rio " + nome +"com " + idade +" de idade e " + AnosServico + " anos de servi�o. N�O REQUERER APOSENTADORIA");
	}

}
