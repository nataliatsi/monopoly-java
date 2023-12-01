public class CasaTeste implements Casa {
    private int posicao;
    private String nome;

    public CasaTeste(int posicao, String nome){
        this.posicao = posicao;
        this.nome = nome;
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
}
