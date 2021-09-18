package Arrays;

import java.util.Arrays;

public class ExercicioForeach {
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for (double notaA: notasAlunoA) {
			System.out.println(notaA);
			totalAlunoA += notaA;
		}
		
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		double notaArmazenada = 5.9; 
		double[] notasAlunosB = { 6.9, 8.9, notaArmazenada, 10 };
		
		double totalAlunoB = 0;
		for (double notaB: notasAlunosB) {
			totalAlunoB += notaB;
			
		}
		
		System.out.println(totalAlunoB / notasAlunosB.length);
	}
}
