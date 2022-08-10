package br.com.alura.escola.aplicacao.aluno.matricular;

public abstract class Ouvinte {

    public void processaEvento(Evento evento) {
        if(deveProcessar(evento)){
            executaEvento(evento);
        }
    }

    protected abstract boolean deveProcessar(Evento evento);
    protected abstract void executaEvento(Evento evento);
}
