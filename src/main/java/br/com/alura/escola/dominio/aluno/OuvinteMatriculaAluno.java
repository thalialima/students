package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.aplicacao.aluno.matricular.Evento;
import br.com.alura.escola.aplicacao.aluno.matricular.Ouvinte;

import java.time.format.DateTimeFormatter;

public class OuvinteMatriculaAluno extends Ouvinte {


    public void executaEvento(Evento evento) {

        String format = ((EventoMatriculaAluno)evento).getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(String.format("Aluno com cpf: %s matriculado com sucesso na data %s", ((EventoMatriculaAluno)evento).getCpf(), format));
    }

    @Override
    public boolean deveProcessar(Evento evento) {
        return evento instanceof EventoMatriculaAluno;
    }

}
