package Controle;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a cor da sua faixa: ");
		String faixa = ler.nextLine();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Bassai-Dai");
		case "marrom":
			System.out.println("Tekki Shodan");
		case "roxa":
			System.out.println("Heian Godan");
		case "verde":
			System.out.println("Heian Yodan");
		case "laranja":
			System.out.println("Heian Sandan");
		case "vermelha":
			System.out.println("Heian Nidan");
		case "amarela":
			System.out.println("Heian Shodan");
		break;
		default:
			System.out.println("Não sei nada!");
		}
		System.out.println();
		
		String conceito = "";
		System.out.print("Digite a nota: ");
		int nota = ler.nextInt();
		
		switch(nota) {
		case 10: case 9: 
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default:
			conceito = "Não informado!";
		}

		System.out.println("Conceito = " + conceito);
		
		ler.close();
	}

}
