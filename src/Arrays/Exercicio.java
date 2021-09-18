package Arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		// Arrays.toString() - função para imprimir o array completo
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) { // função .length para percorrer a quantidade do array
			System.out.println(notasAlunoA[i]);
			totalAlunoA += notasAlunoA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		// para colocar os valores dos indices junto do array
		double notaArmazenada = 5.9; // tbm posso colocar variavel no array
		double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
			
		}
		
		System.out.println(totalAlunoB / notasAlunosB.length);
	}

}
