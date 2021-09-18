package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.0);
		
		Comidas ingrediente1 = new Arroz(0.5);
		
		Comidas ingrediente2 = new Feijao(0.5);
		
		Comidas ingrediente3 = new Sorvete(0.3);
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		
		System.out.println(convidado.getPeso());
		
		Comidas sobremesa = new Sorvete(0.6);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}
