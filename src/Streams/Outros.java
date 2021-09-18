package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("distinct...");//para funcionar precisa implementar hashcode
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.skip(2)//pular 2 elementos
			.limit(2)//limitar a 2 elementos
			.forEach(System.out::println);
				
	}

}
