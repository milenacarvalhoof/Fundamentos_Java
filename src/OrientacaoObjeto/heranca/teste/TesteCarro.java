package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);
		
		ferrari.ligarTurbo();
		ferrari.desligarTurbo();
		
		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		
		ferrari.frear();
		System.out.println(ferrari);
		
		Carro civic = new Civic(250);
		System.out.println(civic.velocidadeAtual);
		
		civic.acelerar();
		System.out.println(civic.velocidadeAtual);
		
		civic.frear();
		System.out.println(civic);
	}
}
