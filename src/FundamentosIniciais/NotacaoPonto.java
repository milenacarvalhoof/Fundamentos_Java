package Fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhor"); // essa função substitui uma palavra por outra
		s = s.toUpperCase(); // essa função deixa o comando todo maiusculo.
		s = s.concat("!!!"); // adiciona a escrita a variavel
		
		System.out.println(s);
		
		String x = "Léo X"
				.replace("X", "Nunes")
				.toUpperCase()
				.concat("!!!");// pode-se tbm colocar em uma linha só, ou da enter antes do ponto para saltar uma linha.	
		System.out.println(x);
	}
}
