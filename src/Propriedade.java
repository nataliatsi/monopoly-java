public class Propriedade implements TabuleiroPosicao {
    private int posicao;
    private String nome;
    private String grupo;
    private int preco;
    private int aluguelSemCasas;
    private int aluguelComUmaCasa, aluguelComDuasCasa, aluguelComTresCasa, aluguelComQuatroCasa;
    private int hotel;
    private int hipoteca;
    private int precoDaCasa;

    public Propriedade(int posicao, String nome, String grupo, int preco, int aluguelSemCasas, int aluguelComUmaCasa, int aluguelComDuasCasa, int aluguelComTresCasa, int aluguelComQuatroCasa, int hotel, int hipoteca, int precoDaCasa) {
        this.posicao = posicao;
        this.nome = nome;
        this.grupo = grupo;
        this.preco = preco;
        this.aluguelSemCasas = aluguelSemCasas;
        this.aluguelComUmaCasa = aluguelComUmaCasa;
        this.aluguelComDuasCasa = aluguelComDuasCasa;
        this.aluguelComTresCasa = aluguelComTresCasa;
        this.aluguelComQuatroCasa = aluguelComQuatroCasa;
        this.hotel = hotel;
        this.hipoteca = hipoteca;
        this.precoDaCasa = precoDaCasa;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public void executarAcao(Jogador jogador) {

    }

}
