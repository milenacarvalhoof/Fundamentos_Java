package oo.heranca.teste;

import oo.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(10, 10);
		
		Jogador heroi = new Heroi(10, 11);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}

}
