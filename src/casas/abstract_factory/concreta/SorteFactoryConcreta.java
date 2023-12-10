package casas.abstract_factory.concreta;

import casas.Sorte;
import casas.abstract_factory.SorteFactory;

public class SorteFactoryConcreta implements SorteFactory {
    @Override
    public Sorte criarSorte(int posicao, String nome, boolean estaNaPrisao) {
        return new Sorte(posicao, nome, estaNaPrisao);
    }
}
