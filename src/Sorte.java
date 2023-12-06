import java.util.ArrayList;
import java.util.Collections;

public class Sorte extends Casa {
    private ArrayList<Cartas> cartas;
    private int indexAtual;

    public Sorte(int posicao, String nome){
        super(posicao, nome);
        this.indexAtual = 0;
        this.cartas = new ArrayList<>();
        inicializarCartas();
        embaralharCartas();
    }

    private void inicializarCartas() {
        cartas.add(new Cartas(1, "Avance para o Ponto de Partida (Go)", "Receba $200", "Isso não é um bônus, ou seja, os $200 referem-se ao valor que o jogador recebe normalmente ao passar pelo Ponto de Partida. Importante: veja a regra acima marcada com um *"));
        cartas.add(new Cartas(2, "Erro do Banco em seu Favor", "Receba $200", ""));
        cartas.add(new Cartas(3, "Taxa do Médico", "Pague $50", ""));
        cartas.add(new Cartas(4, "Abertura da Grande Ópera", "Receba $50 de cada jogador pelas entradas", ""));
        cartas.add(new Cartas(5, "Da Liquidação Fora de Estoque", "Receba $45", ""));
        cartas.add(new Cartas(6, "Saia Livre da Prisão, sem Pagar", "Esta carta pode ser mantida até o uso ou venda. Veja a user story sobre a prisão", ""));
        cartas.add(new Cartas(7, "Vá para a Prisão", "Vá direto para a prisão – Não passe pelo ponto de partida – Não receba $200", ""));
        cartas.add(new Cartas(8, "Restituição do Imposto de Renda", "Receba $20", ""));
        cartas.add(new Cartas(9, "Aniversário do Seguro de Vida", "Receba $100", ""));
        cartas.add(new Cartas(10, "Pague o Hospital", "Pague $100", ""));
        cartas.add(new Cartas(11, "Pague Taxa da Escola", "Pague $150", ""));
        cartas.add(new Cartas(12, "Receba por Seus Serviços", "Receba $25", ""));
        cartas.add(new Cartas(13, "Aniversário dos Fundos de Natal", "Receba $100", ""));
        cartas.add(new Cartas(14, "Você Tirou o Segundo Lugar no Concurso de Beleza", "Receba $10", ""));
        cartas.add(new Cartas(15, "Você Herdou", "Receba $100", ""));
        cartas.add(new Cartas(16, "Você Deve Pagar os Reparos da Rua", "Pague $40 por cada casa, $115 por hotel", "Isso se aplica apenas às casas e hotéis que o jogador possui; ele não precisa pagar pelas casas e hotéis dos outros jogadores."));
    }

    public Cartas getCartaAleatoria() {
        if (indexAtual >= cartas.size()) {
            embaralharCartas();
            indexAtual = 0;
        }

        Cartas carta = cartas.get(indexAtual);
        indexAtual++;
        return carta;
    }

    private void embaralharCartas() {
        Collections.shuffle(cartas);
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    public void executarAcao(Peca peca) {
        System.out.println("O peão avançou para " + getPosicao() + " – " + getNome() + ".");
        Cartas cartaSorteada = getCartaAleatoria();
        System.out.println(cartaSorteada.getNome());
        System.out.println(cartaSorteada.getDescricao());
    }
}
