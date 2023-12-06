import java.util.ArrayList;
import java.util.Collections;

public class CofreComunitario extends Casa {
    private ArrayList<Cartas> cartas;
    private int indexAtual;

    public CofreComunitario(int posicao, String nome){
        super(posicao, nome);
        this.indexAtual = 0;
        this.cartas = new ArrayList<>();
        inicializarCartas();
        embaralharCartas();
    }

    public void inicializarCartas() {
        cartas.add(new Cartas(1, "Avance para o Ponto de Partida", "Receba $200", ""));
        cartas.add(new Cartas(2, "Avance para Illinois Avenue", "O jogador não recebe $200 se passar pelo Ponto de Partida.", ""));
        cartas.add(new Cartas(3, "Avance para St. Charles Place", "Se passar pelo Ponto de Partida, receba $200", ""));
        cartas.add(new Cartas(4, "Avance o peão para o serviço público mais próximo", "Se não tiver dono, você pode comprá-lo do banco. Se tiver, lance os dados e pague ao dono 10 vezes o resultado do lançamento. O jogador não recebe $200 se passar pelo Ponto de Partida.", ""));
        cartas.add(new Cartas(5, "Avance o peão para a ferrovia mais próxima", "Pague ao dono duas vezes o valor que ele deveria receber normalmente. Se a ferrovia não tiver dono, você pode comprá-la do banco. O jogador não recebe $200 se passar pelo Ponto de Partida.", ""));
        cartas.add(new Cartas(6, "O banco lhe pagou dividendos de $50", "", ""));
        cartas.add(new Cartas(7, "Volte 3 espaços", "", ""));
        cartas.add(new Cartas(8, "Vá diretamente para a Prisão", "Não passe pelo ponto de partida, não receba $200.", ""));
        cartas.add(new Cartas(9, "Faça a manutenção de todas as suas propriedades", "Para cada casa, pague $25; para cada hotel, pague $10. Somente para casas e hotéis que o jogador construiu.", ""));
        cartas.add(new Cartas(10, "Pague imposto de pobreza de $15", "", ""));
        cartas.add(new Cartas(11, "Esta carta pode ser mantida até seu uso ou venda", "Get Out Of Jail Free. Veja user stories sobre Prisão.", ""));
        cartas.add(new Cartas(12, "Dê uma volta na Reading", "Se você passar pelo Ponto de Partida, receba $200", ""));
        cartas.add(new Cartas(13, "Dê uma caminhada no Board Walk", "Avance o peão para Board Walk", ""));
        cartas.add(new Cartas(14, "Você foi eleito presidente do tabuleiro", "Pague $50 para cada jogador", ""));
        cartas.add(new Cartas(15, "Seus empréstimos e investimentos fizeram aniversário", "Receba $150", ""));
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

    @Override
    public void executarAcao(Peca peca) {
        System.out.println("O peão avançou para " + getPosicao() + " – " + getNome() + ".");
        Cartas cartaSorteada = getCartaAleatoria();
        System.out.println(cartaSorteada.getNome());
        System.out.println(cartaSorteada.getDescricao());
    }
}
