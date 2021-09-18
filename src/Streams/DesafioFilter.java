package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	//criar 2 expressoes lambdas para 
	//fazer 2 filters diferentes
	//usar um map no final
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4000, 0.3, 0);
		Produto p2 = new Produto("TV", 1500, 0.35, 0);
		Produto p3 = new Produto("Geladeira", 2500, 0.4, 89.00);
		Produto p4 = new Produto("Fogão", 999, 0.2, 0);
		Produto p5 = new Produto("Sofá", 1200, 0.3, 200.00);
		Produto p6 = new Produto("Balcão", 1300, 0.25, 0);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.3;
		Predicate<Produto> freteGratis = p -> p.frete == 0;
		
		Function<Produto, String> chamadaPromocional = p -> p.nome + " com super promoção por: R$ " + p.preco * (1 - p.desconto);
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.map(chamadaPromocional)
			.forEach(System.out::println);
			
		
	}
}
