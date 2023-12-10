package casas;

import jogo.Jogador;
import jogo.Peca;

public class ServicoPublico extends Casa{
    public ServicoPublico(int posicao, String nome, boolean estaNaPrisao) {
        super(posicao, nome, estaNaPrisao);
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());
    }
}
