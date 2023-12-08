package casas;

import casas.Casa;
import jogo.Jogador;
import jogo.Peca;

import java.util.Scanner;

public class Ferrovia extends Casa {
    private int preco;
    private int hipoteca;


    public Ferrovia(int posicao, String nome, int preco, int hipoteca) {
        super(posicao, nome);
        this.preco = preco;
        this.hipoteca = hipoteca;

    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(){ this.preco = preco; }
    public int getHipoteca() {
        return hipoteca;
    }

    @Override
    public void oferecerCompra(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A título da ferrovia " + getNome() + " está disponível por $" + getPreco() + ".");
        System.out.println(jogador.getNome() + ", você possui $" + jogador.getDinheiro() + ".");

        System.out.print("Você deseja comprar " + getNome() +  " (Sim/Não)? ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("Sim")) {
            venderPara(jogador);
        }
    }

    @Override
    public void venderPara(Jogador jogador) {
        if (jogador.getDinheiro() >= getPreco()) {
            jogador.comprarFerrovia(this);
        } else {
            System.out.println(jogador.getNome() + ", você não tem dinheiro suficiente para comprar esta ferrovia.");
        }
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());
        oferecerCompra(peca.getJogador());
    }

}
