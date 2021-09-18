package oo.desafio;

import java.util.ArrayList;


public class Compra {

	String nome;
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void adcItem(Produto produto, int qtde) {
		this.itens.add(new Item(produto, qtde));
	}
	
	void adcItem(String nome, double preco, int qtde) {
		this.itens.add(new Item(new Produto(nome, preco), qtde));
	}
		
	double totalCompra() {
		double total = 0;
		for (Item item: itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}
	
	
}
