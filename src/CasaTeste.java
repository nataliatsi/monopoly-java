public class CasaTeste extends Casa {
    private int posicao;
    private String nome;

    public CasaTeste(int posicao, String nome){
        super(posicao, nome);
    }
    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

    }
}
