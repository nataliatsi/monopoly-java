public class Ferrovia implements Casa {
    private int posicao;
    private String nome;
    private int preco;
    private int hipoteca;


    public Ferrovia(int posicao, String nome, int preco, int hipoteca) {
        this.posicao = posicao;
        this.nome = nome;
        this.preco = preco;
        this.hipoteca = hipoteca;

    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getPosicao() {
        return posicao;
    }

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());
    }

    public int getHipoteca(){
        return hipoteca;
    }
}
