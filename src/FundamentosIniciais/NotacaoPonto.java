package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhor"); // essa fun��o substitui uma palavra por outra
		s = s.toUpperCase(); // essa fun��o deixa o comando todo maiusculo.
		s = s.concat("!!!"); // adiciona a escrita a variavel
		
		System.out.println(s);
		
		String x = "L�o X"
				.replace("X", "Nunes")
				.toUpperCase()
				.concat("!!!");// pode-se tbm colocar em uma linha s�, ou da enter antes do ponto para saltar uma linha.	
		System.out.println(x);
	}
}
