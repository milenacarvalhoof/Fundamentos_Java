package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Milena";
		compra1.adcItem(new Item("Tv", 3, 2.800));// posso deixar o new item, e posso tirar pq já iniciei la no metodo.
		compra1.adcItem("Geladeira", 1, 2.500);
		compra1.adcItem("Computador", 1, 3.999);
		
		System.out.println(compra1.cliente);
		System.out.println(compra1.itens.size() + " Itens");
		System.out.print("Valor total da compra = ");
		System.out.println(compra1.total());
		
		
		
	}
}
