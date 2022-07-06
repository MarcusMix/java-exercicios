package poo;

public class ProdutoTestar {

	public static void main(String[] args) {
		// construtor padrão
		Produto p1 = new Produto();
		p1.nome = "Caneta preta";
		p1.marca = "Faber";
		p1.valor = 1.2;
		
		// construtor dois parametros
		Produto p2 = new Produto("Caneta vermelha", "Bic");
		p2.valor = 1.5;
		
		// construtor de três parametros
		Produto p3 = new Produto("Borracha", "Mercur", 0.99);
		
		//objeto p1
		System.out.println("Nome: " + p1.nome + " Marca: " + p1.marca + ", Valor: " + p1.valor);
		
		//objeto p2
		System.out.println("Nome: " + p2.nome + " Marca: " + p2.marca + ", Valor: " + p2.valor);
		
		//objeto p3
		System.out.println("Nome: " + p3.nome + " Marca: " + p3.marca + ", Valor: " + p3.valor);

	}

}
