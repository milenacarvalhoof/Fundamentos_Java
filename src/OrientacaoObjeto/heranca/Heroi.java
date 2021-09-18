package oo.heranca;

public class Heroi extends Jogador { // para herdar uma classe
	
	public Heroi(int x, int y) {
		super(x, y);
	}	
	
	
	public boolean atacar(Jogador oponente) {
		//para sobreescrever e imprementar no codigo
		//int diffX = Math.abs(x - oponente.x);
		//int diffY = Math.abs(y - oponente.y);
		
		//if (diffX == 0 && diffY == 1) {
		//	oponente.vida -= 20;
		//	return true;
		//} else if (diffY == 0 && diffX == 1) {
		//	oponente.vida -= 20;
		//	return true;
		//} else {
		//	return false;
		//}
		
		// para sobreescrever e nao precisar reescrever tudo
		
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);// atacando 2x
		
		return ataque1 || ataque2;
	}

}
