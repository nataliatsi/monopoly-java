package cartas;

import jogo.Peca;

public class Mover extends Cartas {

    private int novaPosicao;
    private boolean podeReceberBonus;

    public Mover(int numero, String nome, String descricao, String observacoes, int novaPosicao, boolean podeReceberBonus) {
        super(numero, nome, descricao, observacoes);
        this.novaPosicao = novaPosicao;
        this.podeReceberBonus = podeReceberBonus;
    }

    public int getNovaPosicao() {
        return novaPosicao;
    }

    public void setNovaPosicao(int novaPosicao) {
        this.novaPosicao = novaPosicao;
    }

    public boolean isPodeReceberBonus() {
        return podeReceberBonus;
    }

    public void setPodeReceberBonus(boolean podeReceberBonus) {
        this.podeReceberBonus = podeReceberBonus;
    }


    @Override
    public void executarAcao(Peca peca) {
        System.out.println("\nAvançando para " + getNovaPosicao() + ".");
        peca.mover(getNovaPosicao() - peca.getPosicao());
        System.out.println("O peão avançou para " + peca.getPosicao() + " – " + peca.getNomeDaCasa() + ".");

        int bonus = 200;

        if(isPodeReceberBonus()){
            peca.getJogador().aumentarDinheiro(bonus);
        }
    }
}
