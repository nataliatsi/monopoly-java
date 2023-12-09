package cartas;

import jogo.Peca;

public class Pagar extends Cartas {
    private int valor;

    public Pagar(int numero, String nome, String descricao, String observacoes, int valor) {
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

        int pagar = getValor();
        peca.getJogador().diminuirDinheiro(pagar);
        int dinheiroAtual = peca.getJogador().getDinheiro();
        System.out.println("O jogador pagou $" + pagar + ". Novo saldo: $" + dinheiroAtual);

    }
}
