package cartas;

import java.util.ArrayList;
import java.util.Collections;

import casas.Casa;
import jogo.Jogador;
import jogo.Peca;

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

    private void inicializarCartas() {
        cartas.add(new Mover(1, "Avance para o Ponto de Partida (Go)", "Receba $200", "Isso não é um bônus, ou seja, os $200 referem-se ao valor que o jogador recebe normalmente ao passar pelo Ponto de Partida. Importante: veja a regra acima marcada com um *", 40, true, false, false));
        cartas.add(new Receber(2, "Erro do Banco em seu Favor", "Receba $200", "", 200));
        cartas.add(new Pagar(3, "Taxa do Médico", "Pague $50", "", 50));
        cartas.add(new Pagar(4, "Abertura da Grande Ópera", "Receba $50 de cada jogador pelas entradas", "", 50));
        cartas.add(new Receber(5, "Da Liquidação Fora de Estoque", "Receba $45", "", 40));
        cartas.add(new SairPrisao(6, "Saia Livre da Prisão, sem cartas.Pagar", "Esta carta pode ser mantida até o uso ou venda. Veja a user story sobre a prisão", ""));
        cartas.add(new Mover(7, "Vá para a Prisão", "Vá direto para a prisão – Não passe pelo ponto de partida – Não receba $200", "", 30, false, false, false));
        cartas.add(new Receber(8, "Restituição do Imposto de Renda", "Receba $20", "", 20));
        cartas.add(new Receber(9, "Aniversário do Seguro de Vida", "Receba $100", "", 100));
        cartas.add(new Pagar(10, "Pague o Hospital", "Pague $100", "", 100));
        cartas.add(new Pagar(11, "Pague Taxa da Escola", "Pague $150", "", 150));
        cartas.add(new Receber(12, "Receba por Seus Serviços", "Receba $25", "", 25));
        cartas.add(new Receber(13, "Aniversário dos Fundos de Natal", "Receba $100", "", 100));
        cartas.add(new Receber(14, "Você Tirou o Segundo Lugar no Concurso de Beleza", "Receba $10", "", 10));
        cartas.add(new Receber(15, "Você Herdou", "Receba $100", "", 100));
        cartas.add(new Pagar(16, "Você deve pagar os reparos da rua", "Pague $40 por cada casa, $115 por hotel", "Isso se aplica apenas às casas e hotéis que o jogador possui; ele não precisa pagar pelas casas e hotéis dos outros jogadores.", 150));
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
        cartaSorteada.executarAcao(peca);
    }
}
