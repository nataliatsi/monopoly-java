import java.util.ArrayList;

public class Jogador {
    private String nome;
    private String cor;
    private int dinheiro;
    private ArrayList<Titulo> titulos = new ArrayList<>();

    public Jogador(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;

        dinheiro = 1500;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getDinheiro(){
        return dinheiro;
    }

    public void adicionarTitulo(Titulo titulo) {
        titulos.add(titulo);
    }

    public ArrayList<Titulo> getTitulos() {
        return titulos;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Jogador{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor +
                ", dinheiro=" + dinheiro +
                ", titulos=");

        if (titulos.isEmpty()) {
            stringBuilder.append("Nenhum título");
        } else {
            for (Titulo titulo : titulos) {
                stringBuilder.append("\n").append(titulo);
            }
        }

        return stringBuilder.toString();
    }

}




