package lista_condicionais;

public class Ex11 {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 0;
		double n3 = 5;
		double med = 9;
		
		double aprov = (n1 + (n2 * 2) + (n3 * 3) + med) / 7;
		
		if (aprov >= 9)
			System.out.println("A");
		else if (aprov < 9 && aprov >= 7.5) 
			System.out.println("B");
		else if (aprov < 7.5 && aprov >= 6)
			System.out.println("C");
		else if(aprov <6) 
			System.out.println("D");
	}

}
