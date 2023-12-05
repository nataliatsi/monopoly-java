public class PontoDePartida extends Casa {
    private int posicao;
    private String nome;

    public PontoDePartida(int posicao, String nome) {
        super(posicao, nome);
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(getNome());
    }
}
