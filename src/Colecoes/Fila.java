package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		//Queue (fila) - primeiro a entrar é o primeiro a sair
		Queue<String> fila = new LinkedList<String>();
		
		//offer e add -> adc elementos na fila
		// Diferença é o comportamento quando a fila esta cheia
		fila.add("Ana");//dá um problema(erro) - excesão
		fila.offer("Bia");// retorna falso e nao adc o elemento na fila
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.size());
		
		//peek e element mostram o proximo elemento da fila (sem remove-lo)
		// diferença é o comportamento quando a fila esta vazia
		System.out.println(fila.peek());// mostra null (nulo)
		System.out.println(fila.element());// retorna erro
		
		//pool e remove retorna o proximo elemento da fila e remove
		// diferença é o comportamento quando a fila já esta vazia
		// pool retorna null e remove retorna erro
		System.out.println(fila.poll()); 
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		//fila.size() - mostra o tamanho da fila
		//fila.clear(); - limpa a fila
		//fila.isEmpty(); - para saber se a fila está ou não vazia
		//fila.contains() - para ver se elemento esta contido na fila
		
	}
}
