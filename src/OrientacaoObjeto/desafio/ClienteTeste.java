package oo.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Milena");
		
		Compra compra1 = new Compra();
		compra1.adcItem("Tv", 1.800, 2);
		compra1.adcItem("Geladeira", 2.500, 1);
		System.out.println(compra1.totalCompra());
		
		Compra compra2 = new Compra();
		compra2.adcItem("Sofá", 1.000, 1);
		compra2.adcItem("Armário", 1.300, 1);
		System.out.println(compra2.totalCompra());
		
		cliente1.adcCompra(compra1);
		cliente1.adcCompra(compra2);
		
		System.out.println(cliente1.totalGasto());
		
		
	}
}
