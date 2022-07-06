package lista_condicionais;

public class Ex09a {

	public static void main(String[] args) {
		double maca = 10;
		double morango = 10;
		double frutas = morango + maca;
		
		double valormaca = 0.0;
		double valormorango = 0.0;
		

		if (morango <= 5) {
			valormorango = morango * 2.5;
		} else {
			valormorango = morango * 2.2;
		}
		
		if (maca <= 5) {
			valormaca = maca * 1.8;
		} else {
			valormaca = maca * 1.5;
		}
		
		double valorTotal = valormaca + valormorango;
		
		if (valorTotal > 25 || frutas > 8) {
			valorTotal = valorTotal - (valorTotal * 0.1);
		}
		
		System.out.println("O valor a ser pago será " + valorTotal);
	}
}
	
