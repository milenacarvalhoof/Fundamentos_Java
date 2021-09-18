package generics;

public class CaixaNumeroTeste {
	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaA = new CaixaNumero<Integer>();
		caixaA.guardar(100);
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(99.99);
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
	}
}
