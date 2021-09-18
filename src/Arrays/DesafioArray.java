package Arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Quantas notas você vai informar? ");
		int n = ler.nextInt();
		
		double mat[] = new double[n];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print("Digite a " + (i+1) + "ª " + "nota: ");
			mat[i] = ler.nextDouble();
		}
		
		double soma = 0;
		for (double nota: mat) {
			soma += nota;
		}
		
		System.out.println("Média do aluno: " + soma / mat.length);
		
		ler.close();
	}
}
