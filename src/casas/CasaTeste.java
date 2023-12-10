package casas;

import jogo.Jogador;
import jogo.Peca;

public class CasaTeste extends Casa{
    public CasaTeste(int posicao, String nome, boolean estaNaPrisao) {
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
        System.out.println(" e o peão avançõu para " + peca.getPosicao() + " – " + getNome());

    }
}
