package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Ipad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto); 
						
		UnaryOperator<Double> imposto = valor -> valor >= 2500 ? valor * 1.085 : valor;
						
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		
		Function<Double, String> arredondar = valor -> String.valueOf(String.format("%.2f", valor));
				
		Function<String, String> formatar = valor -> ("R$" + valor).replace(",", ".");
		
		String precoFinal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto1);
		System.out.println("O preço final é " + precoFinal);
		
	}

}
