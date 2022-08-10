package br.com.alura.escola.dominio.aluno;


import br.com.alura.escola.aplicacao.aluno.matricular.Evento;

import java.time.LocalDateTime;

public class EventoMatriculaAluno implements Evento {
    private String cpf;
    private LocalDateTime data;

    public EventoMatriculaAluno(String cpf) {
        this.cpf = cpf;
        this.data = LocalDateTime.now();
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getData() {
        return data;
    }
}
