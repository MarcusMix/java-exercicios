package lista_condicionais;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual nome do funcionário?");
		String nome = teclado.next();
		System.out.println("Digite a data de nascimento");
		int nascimento = teclado.nextInt();
		System.out.println("Ano em que " + nome + " entrou na empresa");
		int entradaE = teclado.nextInt();
		int idade = 2022 - nascimento;
		int AnosServico = 2022  - entradaE;
		
		
	
		
		if (idade >= 65)
			System.out.println("O funcionário " + nome +"com " + idade +" de idade e " + AnosServico + " anos de serviço. REQUERER APOSENTADORIA");
		else if (AnosServico >= 30)
			System.out.println("O funcionário " + nome +"com " + idade +" de idade e " + AnosServico + " anos de serviço. REQUERER APOSENTADORIA");
		else if (idade >= 60 && AnosServico > 25)
			System.out.println("O funcionário " + nome +"com " + idade +" de idade e " + AnosServico + " anos de serviço. REQUERER APOSENTADORIA");
		else 
			System.out.println("O funcionário " + nome +"com " + idade +" de idade e " + AnosServico + " anos de serviço. NÃO REQUERER APOSENTADORIA");
	}

}
