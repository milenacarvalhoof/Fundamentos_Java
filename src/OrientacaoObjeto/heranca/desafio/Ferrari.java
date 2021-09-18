package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Ferrari() {
		this(300);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			 return 35;
		}
		else if (ligarTurbo && ligarAr) {
			 return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	//void acelerar() {
		//super.acelerar();
		//super.acelerar();
		//super.acelerar();
		// ao inves de triplicar o metodo como exemplo acima
		//eu posso mudar o parametro diretamente dentro do metodo
	//	velocidadeAtual += 15;
	//}
}
