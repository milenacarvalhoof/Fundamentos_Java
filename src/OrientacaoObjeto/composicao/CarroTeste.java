package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println(c1.motor.ligado);
		
		c1.ligar();
		System.out.println(c1.motor.ligado);
		
		c1.portas.abrir();
		c1.portas.fechar();
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros());
	}

}
