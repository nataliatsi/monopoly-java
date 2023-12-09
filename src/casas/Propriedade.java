package casas;

import casas.Casa;
import jogo.Jogador;
import jogo.Peca;

import java.util.Scanner;

public class Propriedade extends Casa {
    private String grupo;
    private int preco;
    private int aluguelSemCasas;
    private int aluguelComUmaCasa, aluguelComDuasCasa, aluguelComTresCasa, aluguelComQuatroCasa;
    private int hotel;
    private int hipoteca;
    private int precoDaCasa;
    private Jogador proprietario;

    public Propriedade(int posicao, String nome, String grupo, int preco, int aluguelSemCasas, int aluguelComUmaCasa, int aluguelComDuasCasa, int aluguelComTresCasa, int aluguelComQuatroCasa, int hotel, int hipoteca, int precoDaCasa) {
        super(posicao, nome);
        this.grupo = grupo;
        this.preco = preco;
        this.aluguelSemCasas = aluguelSemCasas;
        this.aluguelComUmaCasa = aluguelComUmaCasa;
        this.aluguelComDuasCasa = aluguelComDuasCasa;
        this.aluguelComTresCasa = aluguelComTresCasa;
        this.aluguelComQuatroCasa = aluguelComQuatroCasa;
        this.hotel = hotel;
        this.hipoteca = hipoteca;
        this.precoDaCasa = precoDaCasa;
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

    public int getAluguelSemCasas() {
        return aluguelSemCasas;
    }

    public void setAluguelSemCasas(int aluguelSemCasas) {
        this.aluguelSemCasas = aluguelSemCasas;
    }

    public int getAluguelComUmaCasa() {
        return aluguelComUmaCasa;
    }

    public void setAluguelComUmaCasa(int aluguelComUmaCasa) {
        this.aluguelComUmaCasa = aluguelComUmaCasa;
    }

    public int getAluguelComDuasCasa() {
        return aluguelComDuasCasa;
    }

    public void setAluguelComDuasCasa(int aluguelComDuasCasa) {
        this.aluguelComDuasCasa = aluguelComDuasCasa;
    }

    public int getAluguelComTresCasa() {
        return aluguelComTresCasa;
    }

    public void setAluguelComTresCasa(int aluguelComTresCasa) {
        this.aluguelComTresCasa = aluguelComTresCasa;
    }

    public int getAluguelComQuatroCasa() {
        return aluguelComQuatroCasa;
    }

    public void setAluguelComQuatroCasa(int aluguelComQuatroCasa) {
        this.aluguelComQuatroCasa = aluguelComQuatroCasa;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getHipoteca() {
        return hipoteca;
    }

    public void setHipoteca(int hipoteca) {
        this.hipoteca = hipoteca;
    }

    public int getPrecoDaCasa() {
        return precoDaCasa;
    }

    public void setPrecoDaCasa(int precoDaCasa) {
        this.precoDaCasa = precoDaCasa;
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
        if(getProprietario() == null) {
            oferecerCompra(peca.getJogador());
        }  else {
        System.out.println("A propriedade " + getNome() + " já possui proprietário.");
        }
    }
}
