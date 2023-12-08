package cartas;

import jogo.Peca;

public class Receber extends Cartas {
    private int valor;

    public Receber(int numero, String nome, String descricao, String observacoes, int valor) {
        super(numero, nome, descricao, observacoes);
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void executarAcao(Peca peca) {

        int receber = getValor();
        peca.getJogador().aumentarDinheiro(receber);
        int dinheiroAtual = peca.getJogador().getDinheiro();
        System.out.println("O jogador recebeu $" + receber + ". Novo saldo: $" + dinheiroAtual);
    }
}
