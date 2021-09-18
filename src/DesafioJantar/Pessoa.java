package DesafioJantar;

public class Pessoa {
	
	String nome;
	Double peso;
	
	Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;	
	}
	
	void comer (Comida comida) {
		if(comida != null) {
		this.peso += comida.peso;
		}
	}	
	
	String apresentar() {
		return nome + " pesando: " + peso;
	}
	
}
