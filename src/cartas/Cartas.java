package cartas;

import jogo.Peca;

public abstract class Cartas {

    private int numero;
    private String nome;
    private String descricao;
    private String observacoes;

    public Cartas(int numero, String nome, String descricao, String observacoes){
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;
        this.observacoes = observacoes;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public abstract void executarAcao(Peca peca);

}
