package cartas;

import jogo.Peca;

public class SairPrisao extends Cartas {
    public SairPrisao(int numero, String nome, String descricao, String observacoes) {
        super(numero, nome, descricao, observacoes);
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println("Sair da prisão.");
    }
}
