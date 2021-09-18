package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		//Deque (pilha) - ultimo a entrar � o primeiro a sair
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Pequeno Principe");
		livros.add("Dom Quixote");
		livros.push("O hobbit");
		
		//pool, pop e remove retorna o proximo elemento da fila e remove
		// diferen�a � o comportamento quando a fila j� esta vazia
		// pool retorna null e remove e pop retorna erro
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size() - mostra o tamanho da pilha
		//livros.clear(); - limpa a pilha
		//fila.isEmpty(); - para saber se a fila est� ou n�o vazia
		//fila.contains() - para ver se elemento esta contido na fila
		
	}
}
