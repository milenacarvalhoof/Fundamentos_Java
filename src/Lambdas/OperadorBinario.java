package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (x, y) -> (x + y) / 2;
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> (n1 + n2) / 2 >= 7.0 ? "Aprovado" : "Reprovado";
		
		Function<Double, String> resultado2 = m -> m >= 7.0 ? "Aprovado" : "Reprovado";
		
		//usando funcao media
		System.out.println("Média = " + media.apply(9.8, 5.7));
		//usando funcao resultado
		System.out.println(resultado.apply(9.8, 5.7));
		// usando funcao media + funcao resultado ou seja a funcao resultado2
		System.out.println(media.andThen(resultado2).apply(9.8, 5.7));
	}
}
