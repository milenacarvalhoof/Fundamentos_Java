package Padroes.observer;

public class FestaAniversario {
	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		porteiro.monitorar();
		
		
		
	}
}
