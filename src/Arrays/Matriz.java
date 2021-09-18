package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Qual a quantidade de alunos? ");
		int alunos = ler.nextInt();
		
		System.out.print("Quantas notas cada aluno tem? ");
		int qtdeNotas = ler.nextInt();
		
		double[][] notas = new double[alunos][qtdeNotas];
		
		double soma = 0;
		for (int i = 0; i < alunos; i++) {
			System.out.println((i+1) + "º aluno: " );
			for (int j = 0; j < qtdeNotas; j++) {
				
				System.out.print("Nota " + (j+1) + ": ");
				notas[i][j] = ler.nextDouble();
				soma += notas[i][j];
				
			}
			
		}
		
		double media = soma / (alunos * qtdeNotas);
		System.out.println("Média dos alunos: " + media);
		
		for (double[] notasDoAluno: notas) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		ler.close();
	}

}
