package Fundamentos;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 7.6;
		// se o resultado for maior ou igual a 7.0 exibir a mensagem aprovado se nao recuperação 
		// simbolo ? separa a expressão do resultado da variavel
		// simbolo : separa os resultados possiveis da variavel
		String resultado = media >= 7.0 ? "Aprovado" : "Recuperação";
		System.out.println(resultado);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		// se temDesconto for verdadeiro imprime sim se nao imprime não dessa forma.
		String resultadoDesconto = temDesconto ? "Sim" : "Não";
		System.out.println("Tem desconto? " + resultadoDesconto);
		
	}

}
