package casas.abstract_factory.concreta;

import casas.ServicoPublico;
import casas.abstract_factory.ServicoPublicoFactory;

public class ServicoPublicoFactoryConcreta implements ServicoPublicoFactory {
    @Override
    public ServicoPublico criarServicoPublico(int posicao, String nome, boolean estaNaPrisao, int preco) {
        return new ServicoPublico(posicao, nome, estaNaPrisao, preco);
    }
}
