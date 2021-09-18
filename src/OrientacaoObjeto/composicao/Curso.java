package oo.composicao;

import java.util.ArrayList;

public class Curso {
	
	final String nomeCurso;
	final ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	Curso (String nome) {
		nomeCurso = nome;
	}
	
	void adcAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
