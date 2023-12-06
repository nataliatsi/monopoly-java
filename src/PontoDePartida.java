public class PontoDePartida extends Casa {
    private int posicao;
    private String nome;

    public PontoDePartida(int posicao, String nome) {
        super(posicao, nome);
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());
    }
}
