package oo.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adcCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double totalGasto() {
		double total = 0;
		for (Compra compra: compras) {
			total += compra.totalCompra();
		}
		return total;
	}
	
	
}
