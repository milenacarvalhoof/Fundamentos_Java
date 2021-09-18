package Lambdas;

public class CalculoTeste1 {
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(2.5, 5.5));
		
		// Polimorfismo
		calculo = new Multiplicacao();
		System.out.println(calculo.executar(3, 5));
		
	}

}
