package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	String aluno;
	ArrayList<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome) {
		this.aluno = nome;
	}
	
	void adcCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for (Curso curso: this.cursos) {
			if (curso.nomeCurso.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		return null;
	}
	
	public String toString() {
		return aluno;
	}
}
