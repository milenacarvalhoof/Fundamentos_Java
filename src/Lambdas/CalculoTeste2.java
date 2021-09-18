package Lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		//Fun��o Lambda Substitui classes com metodos porque j� implementa metodo aqui
		Calculo calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.executar(2.5, 5.5));
		
		//Func�o Lambda tbm tem polimorfismo
		// E Posso abreviar dessa forma(retirando as chaves e return)
		calculo = (a, b) -> a * b; 
		System.out.println(calculo.executar(3, 5));
		
	}

}
