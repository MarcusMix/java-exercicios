package lista_while;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String opcao;
		double media = 0;
		int i = 0;
		int maiorHabitante = 0;
		int habitante = 0;
		int mSalarial = 0;
		int  mFilhos = 0;
		int mediaMenor = 0;
		int maiorSalario = 0;
		double salario = 0;
		
		do {
			System.out.println("Digite o sal�rio do " +(++i) +"� habitante.");
			salario = teclado.nextDouble();
			habitante++;
			mSalarial += salario;
			if (salario > maiorSalario) {
				maiorSalario = (int) salario;
				maiorHabitante = habitante;
			}
			if (salario <= 1000) {
				mediaMenor++;
			}
			System.out.println("Digite quantos filhos ele tem: ");
			int filhos = teclado.nextInt();
			mFilhos = filhos + mFilhos;
			System.out.println("Deseja adicinar mais habitantes? S � SIM N � N�O");
			opcao = teclado.next();
			opcao = opcao.toUpperCase();
		}while(opcao.equals("S"));
		System.out.println("A m�dia de salario da popula��o �: " + ((mSalarial) / (habitante + mFilhos)));
		System.out.println("A m�dia do n�mero de filhos �: " + (mFilhos / habitante));
		System.out.println("O maior sal�rio dos habitantes � : " + maiorSalario);
		System.out.println("O percentual de habitantes com sal�rio inferior a R$ 1000,00 �: " + mediaMenor);
	}

}
		