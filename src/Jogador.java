public class Jogador {
    private String nome;
    private String cor;
    private int posicao;

    public Jogador(String nome, String cor, int posicao){
        this.nome = nome;
        this.cor = cor;
        this.posicao = 0;
    }

    public int getPosicao(){
        return posicao;
    }
    public void setPosicao(int posicao){
        this.posicao = posicao;
    }
    public String getNome() {
        return nome;
    }
    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Player{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", posição=" + posicao +
                '}';
    }
}
