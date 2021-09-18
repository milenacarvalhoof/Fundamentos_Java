package Lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		//Função Lambda Substitui classes com metodos porque já implementa metodo aqui
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.executar(2.5, 5.5));
		
		//Funcão Lambda tbm tem polimorfismo
		// E Posso abreviar dessa forma(retirando as chaves e return)
		calculo = (a, b) -> a * b; 
		System.out.println(calculo.executar(3, 5));
		
	}

}
