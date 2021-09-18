package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		String comando = "";
		
		while (!comando.equalsIgnoreCase("sair")) {
			System.out.println("Ok!");
			System.out.println("O que deseja: ");
			comando = ler.nextLine();
		}
		
		ler.close();
		}
	}
