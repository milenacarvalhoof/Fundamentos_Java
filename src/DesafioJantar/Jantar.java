package DesafioJantar;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida ("Feijão", 0.223);				
		Comida c2 = new Comida("Arroz", 0.3);
				
		Pessoa p1 = new Pessoa("Maria", 55.0);		
		Pessoa p2 = new Pessoa("João", 70.0);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		
		System.out.println(p2.apresentar());
		p2.comer(c2);
		
		System.out.println(p2.apresentar());
	}

}
