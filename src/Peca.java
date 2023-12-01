public class Peca {
    private String jogadorNome;
    private int posicao;

    public Peca(String jogadorNome) {
        this.jogadorNome = jogadorNome;
        this.posicao = 0;
    }

    public String getJogadorNome() {
        return jogadorNome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void mover(int passos) {
        // Método para mover a peça por um número específico de casas no tabuleiro
        posicao += passos;
    }

}
