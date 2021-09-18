package oo.heranca;

import oo.Direcao;

public class Jogador {

	public int vida = 100;
	private int x;
	private int y;
	
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador oponente) {
		
		int diffX = Math.abs(x - oponente.x);
		int diffY = Math.abs(y - oponente.y);
		
		if (diffX == 0 && diffY == 1) {
			oponente.vida -= 10;
			return true;
		} else if (diffY == 0 && diffX == 1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}		
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
	
}
