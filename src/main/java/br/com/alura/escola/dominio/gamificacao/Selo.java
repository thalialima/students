package br.com.alura.escola.dominio.gamificacao;

import br.com.alura.escola.dominio.aluno.CPF;

public class Selo {
    private CPF alunoCpf;
    private String nome;

    public Selo(CPF alunoCpf, String nome) {
        this.alunoCpf = alunoCpf;
        this.nome = nome;
    }

    public CPF getAlunoCpf() {
        return alunoCpf;
    }

    public String getNome() {
        return nome;
    }
}
