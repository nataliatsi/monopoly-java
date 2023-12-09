package cartas;

import jogo.Peca;

public abstract class Cartas {

    private int numero;
    private String nome;
    private String descricao;

    public Cartas(int numero, String nome, String descricao){
        this.numero = numero;
        this.nome = nome;
        this.descricao = descricao;

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

    public abstract void executarAcao(Peca peca);

}
