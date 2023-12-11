package casas.abstract_factory.concreta;

import casas.Propriedade;
import casas.abstract_factory.PropriedadeFactory;

public class PropriedadeFactoryConcreta implements PropriedadeFactory {
    @Override
    public Propriedade criarPropriedade(int posicao, String nome, boolean estaNaPrisao, String grupo, int preco, int corrida) {
        return new Propriedade(posicao, nome, estaNaPrisao, grupo, preco, corrida);
    }
}
