package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
		System.out.println(calculo.apply(2.5, 5.5));
		
		calculo = (x, y) -> x * y;
		System.out.println(calculo.apply(3.0, 5.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> x + y;
		System.out.println(calculo2.apply(2, 5));
		
		calculo2 = (x, y) -> x * y;
		System.out.println(calculo2.apply(3, 5));
		
		
	}

}
