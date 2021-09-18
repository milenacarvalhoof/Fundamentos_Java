package oo.heranca.desafio;

public class Carro {
	
	private final int velocidadeMaxima;
	public int velocidadeAtual = 0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
		
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public void acelerar() {
		if (velocidadeAtual + getDelta() > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		} else {
		velocidadeAtual += getDelta();
		}
	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}		
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h.";
	}
	

}
