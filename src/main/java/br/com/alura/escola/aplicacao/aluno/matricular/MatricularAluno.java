package br.com.alura.escola.aplicacao.aluno.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.EventoMatriculaAluno;
import br.com.alura.escola.dominio.aluno.OuvinteMatriculaAluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
	
	private final RepositorioDeAlunos repositorio;
	PublicadorDeEvento publicadorDeEvento;

	public MatricularAluno(RepositorioDeAlunos repositorio) {
		this.repositorio = repositorio;
		this.publicadorDeEvento = new PublicadorDeEvento();
	}
	
	// COMMAND
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		publicadorDeEvento.adicionaOuvintes(new OuvinteMatriculaAluno());
		publicadorDeEvento.publicarEventos(new EventoMatriculaAluno(novo.getCpf()));
	}

}
