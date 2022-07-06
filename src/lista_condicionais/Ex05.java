package lista_condicionais;

public class Ex05 {

	public static void main(String[] args) {
		double qtAtual = 16;
		double qtMax = 20;
		double qtMin = 10;
		double media = (qtMax + qtMin) / 2;
		double verificar = qtAtual - media;
		if(verificar < 0) 
			System.out.println("EFETUAR A COMPRA DESTE PRODUTO");
		else 
			System.out.println("NÃO É NECESSÁRIO EFETUAR A COMPRA DESTE PRODUTO");
		
	}

}
