package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adcItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adcItem(String nome, int qtde, double preco) {
	//  posso fazer de 2 formas
	//	itens.add(new Item(nome, qtde, preco));
		adcItem(new Item(nome, qtde, preco));
	}
	
	double total() {
		double total = 0;
		
		for (Item item: itens) {
			total += item.qtde * item.preco;
		}
		
		return total;
	}
	
	
}
