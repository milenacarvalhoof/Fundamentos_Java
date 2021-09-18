package Classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		int a = 2;
		int b = a; // atribuição po valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b); // quando altera a, nao altera b
		
		Data d1 = new Data();
		Data d2 = d1; // atribuição po referencia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.dataFormatada()); // quando altera a, altera b e vice versa
		System.out.println(d2.dataFormatada());
		
	}

}
