package lista_condicionais;

public class Ex07 {

	public static void main(String[] args) {
		int a = 10;
		int g = 20;
		double valorA = 6.2 * a;
		double valorG = 6.9 * g;
		if (g <= 20)
			System.out.println("Valor por " + g + " litros de gasolina é " + (valorG -(valorG * 0.04)));
		if (g > 20)
			System.out.println("Valor por " + g + " litros de gasolina é " + (valorG -(valorG * 0.06)));
		if (a <= 20)
			System.out.println("Valor por " + a + " litros de álcool é " + (valorA -(valorA * 0.03)));
		if (a > 20)
			System.out.println("Valor por " + a + " litros de álcool é " + (valorA -(valorA * 0.05)));
	}

}
