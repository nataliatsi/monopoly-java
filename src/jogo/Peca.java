package jogo;

import casas.Casa;
import casas.Ferrovia;
import casas.ServicoPublico;

import java.util.ArrayList;
import java.util.List;

public class Peca {
    private Jogador jogador;
    private int posicao;
    private Tabuleiro tabuleiro;

    public Peca(Jogador jogador, Tabuleiro tabuleiro) {
        this.jogador = jogador;
        this.tabuleiro = tabuleiro;
        this.posicao = 0;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public int getPosicao() {
        return posicao;
    }

    public void mover(int passos) {
        // posicao += passos;
        posicao = (posicao + passos - 1) % 40 + 1;
    }

    public String getNomeDaCasa(){
        return tabuleiro.getCasaNaPosicao(posicao).getNome();
    }

    public List<Ferrovia> getFerrovias(){
        return tabuleiro.getFerrovias();
    }

    public List<ServicoPublico> getServicoPublico(){
        return tabuleiro.getServicoPublico();
    }

    public void status() {
        Casa nomePosicao = tabuleiro.getCasaNaPosicao(posicao);

        System.out.println("O status do jogador " + jogador.getNome() + " – " + jogador.getCor() + " é o seguinte: ");
        System.out.println("Situação na posição: " + getPosicao() + " – " + nomePosicao.getNome());
        System.out.println("Possui $" + jogador.getDinheiro());

        ArrayList<Titulo> titulos = jogador.getTitulos();
        if (!titulos.isEmpty()) {
            System.out.println("\nTítulos:");
            for (Titulo titulo : titulos) {
                System.out.println(titulo.getNome());
            }
            System.out.println("\n");
        } else {
            System.out.println("O jogador " + jogador.getNome() + " não possui títulos.\n");
        }

    }

}
