package Fundamentos;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		//System.out.print(); escreve na mesma linha
		//System.out.println(); escreve com quebra de linha
		//System.out.printf(); escreve com formatação
		// %d para int - usando o printf
		// %f para double - usando o printf
		// %s para string - usando o printf
		
		Scanner entrada = new Scanner(System.in); // comando para ler
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine(); //ler caractere
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // ler inteiro
		
		System.out.print("Digite seu salario: ");
		double salario = entrada.nextDouble(); // ler real
		
		System.out.printf("%s, %d anos, recebe %.2f reais.", nome, idade, salario);
		
		entrada.close();// é obrigatório finalizar o comando ler
	}
}
