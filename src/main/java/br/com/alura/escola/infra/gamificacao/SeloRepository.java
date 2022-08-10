package br.com.alura.escola.infra.gamificacao;

import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.gamificacao.Selo;

import java.util.List;
import java.util.stream.Stream;

public class SeloRepository {
    private List<Selo> selos;

    public void adicionaSelos(Selo selo) {
        selos.add(selo);
    }

    public Selo buscaSeloPorCpf(String cpf) {
        return selos.stream().filter(selo -> selo
                        .getAlunoCpf()
                        .equals(new CPF(cpf))).findFirst().orElse(null);
    }

    public void removeByCPF(String cpf) {
        Selo selo1 = selos.stream().filter(selo -> selo
                        .getAlunoCpf()
                        .equals(new CPF(cpf))).findFirst().orElse(null);
        this.selos.remove(selo1);
    }
}
