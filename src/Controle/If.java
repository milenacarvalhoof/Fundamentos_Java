package Controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a media: ");
		double nota = ler.nextDouble();
		
		if (nota > 10 || nota < 0) { // se
			System.out.println("Nota inválida!");
		}
		else if (nota >= 8.1) { // se não, se
			System.out.println("Conceito A");
		}
		else if (nota >= 6.1) { // se não, se
			System.out.println("Conceito B");
		}
		else if (nota >= 4.1) { // se não, se
			System.out.println("Conceito C");
		} 
		else if (nota >= 2.1) { // se não, se
			System.out.println("Conceito D");
		}
		else { // se não
			System.out.println("Conceito E");
		}
		
		ler.close();
	}

}
