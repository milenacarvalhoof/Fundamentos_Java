package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Milena");
		Aluno a2 = new Aluno("Marianna");
		Aluno a3 = new Aluno("Maria");
		
		Curso c1 = new Curso("Java");
		Curso c2 = new Curso("Web");
		Curso c3 = new Curso("React");
		
		c1.adcAluno(a1);
		c1.adcAluno(a2);
		
		c2.adcAluno(a1);
		c2.adcAluno(a3);
		
		a1.adcCurso(c3);
		a2.adcCurso(c3);
		a3.adcCurso(c3);
		
		
		System.out.println("Alunos do curso: " + c1.nomeCurso);
		for (Aluno aluno: c1.alunos) {
			System.out.println(aluno.aluno);
		}
		
		System.out.println("Alunos do curso: " + c2.nomeCurso);
		for (Aluno aluno: c2.alunos) {
			System.out.println(aluno.aluno);
		}
		
		System.out.println("Alunos do curso: " + c3.nomeCurso);
		for (Aluno aluno: c3.alunos) {
			System.out.println(aluno.aluno);
		}
		
		System.out.println(a1.aluno + " Está cursando:");
		for (Curso curso: a1.cursos) {
			System.out.println(curso.nomeCurso);
		}
		
		Curso cursoEncontrado = a1.obterCursoPorNome("Java");
		
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nomeCurso);
			System.out.println(cursoEncontrado.alunos);
		}
		
	}
}
