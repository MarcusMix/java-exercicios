package poo;

public class CarroTestar {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		
		c1.nome = "Uno";
		c1.marca = "Fiat";
		c1.ano = 2002;
		c1.vel = 60;
		
		c1.acelerar(10);
		
		System.out.println("A velocidade do carro é: " + c1.vel + " Km/h");
		
		c1.freiar(40);
		
		System.out.println("A velocidade do carro é: " + c1.vel + " Km/h");
	}

}
