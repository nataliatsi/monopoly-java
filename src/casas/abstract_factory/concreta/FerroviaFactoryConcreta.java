package casas.abstract_factory.concreta;

import casas.Ferrovia;
import casas.abstract_factory.FerroviaFactory;

public class FerroviaFactoryConcreta implements FerroviaFactory {
    @Override
    public Ferrovia criarFerrovia(int posicao, String nome, boolean estaNaPrisao, int preco, int hipoteca) {
        return new Ferrovia(posicao, nome, estaNaPrisao, preco, hipoteca);
    }
}
