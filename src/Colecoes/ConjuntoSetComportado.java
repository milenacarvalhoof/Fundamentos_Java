package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet; // cntrl shift o para importar automaticamente

public class ConjuntoSetComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); // coloca maior e menor no final vazio ou coloca o tipo dentro	
		SortedSet<String> listaAprovados = new TreeSet<>(); // para ter uma lista com ordem de seção	
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		System.out.println("Lista dos aprovados:");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);// para imprimir todos conteudos da lista
		}
		
		Set<Integer> nums = new HashSet<>();//não pode colocar tipo primitivo, usa a classe que representa o tipo primitivo	
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (int numero: nums) {
			System.out.println(numero);
		}
	}
}
