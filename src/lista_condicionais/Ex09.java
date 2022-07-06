package frutaria;

public class Frutarua {

	public static void main(String[] args) {
		System.out.println(calculaValor(3.0, 0.0)); // 7.5
		System.out.println(calculaValor(0.0, 3.0)); // 5.4
		System.out.println(calculaValor(2.0, 1.0)); // 6.8
		System.out.println(calculaValor(6.0, 0.0)); // 13.20
		System.out.println(calculaValor(0.0, 6.0)); // 9
		System.out.println(calculaValor(3.0, 6.0)); //  14,85 = (16.5) - (1.65)
		System.out.println(calculaValor(6.0, 3.0)); //  16,74 = (18.6) - (1.86)		

	}
	
	public static double calculaValor(double kgMorango, double kgMaca) {

//		double valorMorango = kgMorango * (kgMorango <= 5.0 ? 2.5 : 2.2);
//		double valorMaca = kgMaca * (kgMaca <= 5.0 ? 1.8 : 1.5);
		double valorMorango = 0.0;
		double valorMaca = 0.0;
		
		if(kgMorango <= 5.0) {
			valorMorango = kgMorango * 2.5;
		} else {
			valorMorango = kgMorango * 2.2;
		}
		
		if(kgMaca <= 5.0) {
			valorMaca = kgMaca * 1.8;
		} else {
			valorMaca = kgMaca * 1.5;
		}
		
		double valorTotal = valorMaca + valorMorango;
		
		if(valorTotal > 25.0 ||  (kgMorango + kgMaca) > 8)
			valorTotal = valorTotal - (valorTotal * 0.1);
		
		
		return valorTotal;
		
	}
}
