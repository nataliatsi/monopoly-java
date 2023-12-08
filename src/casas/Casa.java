package casas;

import jogo.Jogador;
import jogo.Peca;

public abstract class Casa {
    private int posicao;
    private String nome;

    public Casa(int posicao, String nome){
        this.posicao = posicao;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public int getPosicao(){
        return posicao;
    }
    public abstract void oferecerCompra(Jogador jogador);
    public abstract void venderPara(Jogador jogador);
    public  abstract void executarAcao(Peca peca);


}