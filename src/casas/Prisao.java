package casas;

import jogo.Jogador;
import jogo.Peca;

public class Prisao extends Casa{
    public Prisao(int posicao, String nome) {
        super(posicao, nome);
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println("O peão avançou para " + getPosicao() + " – " + getNome());
    }
}
