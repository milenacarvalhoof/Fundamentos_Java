package oo.composicao;

public class Motor {
	
	boolean ligado = false;
	double fatorInjecao = 1;
	Carro carro;
	
	Motor(Carro carro){
		this.carro = carro;		
	}
	
	int giros() {
		return  (int) Math.round(fatorInjecao * 3000);
	}

}
