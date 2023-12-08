package jogo;

public class Titulo {
    private String nome;
    private String cor;
    private int aluguel;
    private int corrida;

    public Titulo(String nome, String cor, int aluguel, int corrida) {
        this.nome = nome;
        this.cor = cor;
        this.aluguel = aluguel;
        this.corrida = corrida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public int getCorrida() {
        return corrida;
    }

    public void setCorrida(int corrida) {
        this.corrida = corrida;
    }
}