public class PontoDePartida implements Casa {
    private int posicao;
    private String nome;

    public PontoDePartida(int posicao, String nome) {
        this.posicao = posicao;
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public int getPosicao() {
        return 0;
    }

    @Override
    public void executarAcao(Jogador jogador) {
        System.out.println(getNome());

    }
}
