package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultado = new Pares<Integer, String>();
		resultado.adcionar(1, "Maria");
		resultado.adcionar(2, "Pedro");
		resultado.adcionar(3, "Gui");
		resultado.adcionar(4, "Ana");
		resultado.adcionar(2, "Rebeca");
		
		System.out.println(resultado.getValor(1));
		System.out.println(resultado.getValor(2));	
	}

}
