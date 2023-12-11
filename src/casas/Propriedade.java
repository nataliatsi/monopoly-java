package casas;

import jogo.Jogador;
import jogo.Peca;

import java.util.Scanner;

public class Propriedade extends Casa {
    private String grupo;
    private int preco;
    private int aluguel;
    private Jogador proprietario;

    public Propriedade(int posicao, String nome, boolean estaNaPrisao, String grupo, int preco, int aluguel) {
        super(posicao, nome, estaNaPrisao);
        this.grupo = grupo;
        this.preco = preco;
        this.aluguel = aluguel;
        this.proprietario = null;
    }

    public String getGrupo() {
        return grupo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public Jogador getProprietario() {
        return proprietario;
    }

    public void setProprietario(Jogador proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public void oferecerCompra(Jogador jogador) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A título da propriedade " + getNome() + " está disponível por $" + getPreco() + ".");
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
            jogador.comprarPropriedade(this);
        } else {
            System.out.println(jogador.getNome() + ", você não tem dinheiro suficiente para comprar esta propriedade.");
        }
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

        if (getProprietario() != null) {
            System.out.println("A propriedade " + getNome() + " já possui proprietário.");

            int taxa = getAluguel();

            peca.getJogador().diminuirDinheiro(taxa);
            getProprietario().aumentarDinheiro(taxa);

            System.out.println("O jogador " + peca.getJogador().getNome() + " pagou o aluguel de $" + taxa +
                    " para " + getProprietario().getNome());
            System.out.println("Novo saldo: $" + peca.getJogador().getDinheiro());

        } else {
            oferecerCompra(peca.getJogador());
        }
    }
}
