package oo.composicao;

public class Carro {
	
	Motor motor = new Motor(this);
	Portas portas = new Portas();
	
	//Carro() {
	//	this.motor = new Motor(this);
	//}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	void acelerar() {
		if (motor.ligado != false && motor.fatorInjecao < 2.6 && portas.portaAberta != true) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (motor.ligado != false && motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}

}
