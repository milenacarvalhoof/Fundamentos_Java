package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// if (...) {sentença;}
		// while (...) {sentença;}
		// for (...;...;...) {sentença;}
		
		// do {senteça;} while(...);
		// para criar trexo automatico vai em preferences java templates e criar um igual ler
		Scanner ler = new Scanner(System.in);

		String texto = "";
		
		do {
			System.out.println("Digite as palavras magicas:");	
			System.out.println("Quer Sair...");
			texto = ler.nextLine();
			
		} while(!texto.equalsIgnoreCase("Por favor"));

		System.out.println("Obrigada");
		
		
		ler.close();
		
		
		
	}
}
