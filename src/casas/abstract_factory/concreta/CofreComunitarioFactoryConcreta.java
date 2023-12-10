package casas.abstract_factory.concreta;

import casas.CofreComunitario;
import casas.abstract_factory.CofreComunitarioFactory;

public class CofreComunitarioFactoryConcreta implements CofreComunitarioFactory {
    @Override
    public CofreComunitario criarCofreComunitario(int posicao, String nome, boolean estaNaPrisao) {
        return new CofreComunitario(posicao, nome, estaNaPrisao);
    }
}
