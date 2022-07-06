package lista_condicionais;

public class Ex10 {

	public static void main(String[] args) {
		String produto = "Cigarro";
		double qt = 5;
		double preco = 1;
		double total = qt * preco;
		
		
		if (qt <= 5) {
			double totalPagar = total - (total * 0.02);
			System.out.println(produto +" Total é " + total + " desconto de 2% e o total a pagar será: " + totalPagar);
			
			
		} else if (qt > 5 && qt <= 10) {
			double totalPagar = total - (total * 0.03);
			System.out.println(produto +" Total é " + total + " desconto de 3% e o total a pagar será: " + totalPagar);
			
			
		} else if (qt > 10) {
			double totalPagar = total - (total * 0.05);
			System.out.println(produto +" Total é " + total + " desconto de 5% e o total a pagar será: " + totalPagar);
		}
		

	}

}
