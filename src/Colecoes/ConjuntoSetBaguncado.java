package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoSetBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" }) // para ele deixar o conjunto bagunçado
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é " + conjunto.size()); // size mostra o tamanho do conjunto
		
		conjunto.add("Teste");
		conjunto.add('x');
		System.out.println("O tamanho é " + conjunto.size()); // não conta repetiçoes
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("O tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1)); // contains serve para verificar se está ou não contido no conjunto
		
		Set nums = new HashSet(); // tbm pode ser escrito dessa forma
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);// imprimir conjunto completo
		System.out.println(conjunto);
		 
		// conjunto.retainAll(nums); // ver valores em comum nos conuntos
		//conjunto.addAll(nums); // unir dois conjuntos
		conjunto.clear(); // limpar o conjunto
		
		
		System.out.println(conjunto);
		
	}

}
