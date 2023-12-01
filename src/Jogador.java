public class Jogador {
    private String nome;
    private String cor;
    private Peca peca;

    public Jogador(String nome, String cor, Peca peca) {
        this.nome = nome;
        this.cor = cor;
        this.peca = peca;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Peca getPeca() {
        return peca;
    }

    /*
    public void comprarPropriedade(Propriedade propriedade) {
        // comprar a propriedade
    }

    public void pagarAluguel(Jogador proprietario, int valor) {
        // pagar o aluguel ao proprietário
    }
    */

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", peca=" + peca +
                '}';
    }
}
