package poo;

public class Carro {
	
	// atributos
	String nome;
	String marca;
	int ano;
	int vel;
	
	//m�todos
	void acelerar(int aceleracao) {
		vel += aceleracao;
	}
	
	void freiar(int reduzir) {
		vel -= reduzir;
	}
	
	void buzinar() {
		System.out.println("biiiiiii");
	}
}
