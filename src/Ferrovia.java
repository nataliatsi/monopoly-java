public class Ferrovia extends Casa {
    private int posicao;
    private String nome;
    private int preco;
    private int hipoteca;


    public Ferrovia(int posicao, String nome, int preco, int hipoteca) {
        super(posicao, nome);
        this.preco = preco;
        this.hipoteca = hipoteca;

    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());
    }

    public int getHipoteca(){
        return hipoteca;
    }
}
