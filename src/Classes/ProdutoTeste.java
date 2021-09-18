package Classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89); //com produto
		
		Produto p2 = new Produto(); //sem produto
		p2.nome = "Caneta Preta"; 
		p2.preco = 12.56; 
		
		// Produto.desconto = 0.50; o desconto mesmo estatico pode ser alterado, mas o valor estatico passa a ser esse
				
		System.out.printf("%s: De R$ %.2f Por %.2f ", p1.nome, p1.preco, p1.precoComDesconto());
		System.out.println();
		System.out.printf("%s: De R$ %.2f Por %.2f ", p2.nome, p2.preco, p2.precoComDesconto());
		
	}
}
