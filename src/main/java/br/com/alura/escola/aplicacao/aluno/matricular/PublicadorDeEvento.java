package br.com.alura.escola.aplicacao.aluno.matricular;

import java.util.ArrayList;
import java.util.List;

public class PublicadorDeEvento {
    private List<Ouvinte> ouvintes;

    public PublicadorDeEvento() {
        this.ouvintes = new ArrayList<>();
    }

    public void adicionaOuvintes(Ouvinte ouvinte){
        this.ouvintes.add(ouvinte);
    }

    public void publicarEventos(Evento evento) {
        ouvintes.forEach(ouvinte -> ouvinte.processaEvento(evento));
    }
}
