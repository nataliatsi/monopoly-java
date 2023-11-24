public class Ferrovia implements TabuleiroPosicao {
    private int posicao;
    private String nome;
    private int preco;


    public Ferrovia(int posicao, String nome, int preco) {
        this.posicao = posicao;
        this.nome = nome;
        this.preco = preco;

    }
    @Override
    public String getNome() {
        return null;
    }

    @Override
    public void executarAcao(Jogador jogador) {

    }
}
