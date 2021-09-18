package Colecoes;

import java.util.ArrayList;

public class ConjuntoLista {
	
	public static void main(String[] args) {
		//pode usar só list no inicio
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario ("Carlos"));
		lista.add(new Usuario ("Lia"));
		lista.add(new Usuario ("Bia"));
		lista.add(new Usuario ("Manu"));
		
		System.out.println(lista.get(3));// pode acessar pelo indice
		
		lista.remove(3); // remove pelo indice
		System.out.println(lista.remove(new Usuario ("Manu")));// remove pelo objeto
		
		System.out.println(lista.contains(new Usuario ("Ana"))); // verificar se esta contido
		
		
		
		for (Usuario u: lista) {
			System.out.println(u);
		}
		
	}

}
