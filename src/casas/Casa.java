package casas;

import jogo.Jogador;
import jogo.Peca;

public abstract class Casa {
    private int posicao;
    private String nome;
    private boolean estaNaPrisao;

    public Casa(int posicao, String nome, boolean estaNaPrisao){
        this.posicao = posicao;
        this.nome = nome;
        this.estaNaPrisao = estaNaPrisao;
    }

    public String getNome(){
        return nome;
    }
    public int getPosicao(){
        return posicao;
    }
    public boolean estaNaPrisao() {
        return estaNaPrisao;
    }
    public void entrarNaPrisao() {
        estaNaPrisao = true;
    }
    public void sairDaPrisao() {
        estaNaPrisao = false;
    }
    public abstract void oferecerCompra(Jogador jogador);
    public abstract void venderPara(Jogador jogador);
    public  abstract void executarAcao(Peca peca);


}