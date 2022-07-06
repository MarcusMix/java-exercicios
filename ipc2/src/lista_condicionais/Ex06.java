package lista_condicionais;

public class Ex06 {

	private static final String Flamengo = "Flamengo";
	private static final String Corinthians = "Corinthians";

	public static void main(String[] args) {
		int time1Gol = 4;
		int time2Gol = 3;
		if (time1Gol > time2Gol)
			System.out.println( Flamengo + " ganhou");
		if (time1Gol < time2Gol)
			System.out.println( Corinthians + " ganhou");
		if (time1Gol == time2Gol)
			System.out.println("Empate");
}
}