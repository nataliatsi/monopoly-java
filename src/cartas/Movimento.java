package cartas;

import casas.Ferrovia;
import casas.ServicoPublico;
import jogo.Peca;

import java.util.List;

public class Movimento extends Cartas {

    private int novaPosicao;
    private boolean podeReceberBonus;
    private boolean irParaFerrovia;
    private boolean irParaServicoPublico;
    private boolean irParaPrisao;

    public Movimento(int numero, String nome, String descricao, int novaPosicao, boolean podeReceberBonus, boolean irParaFerrovia, boolean irParaServicoPublico) {
        super(numero, nome, descricao);
        this.novaPosicao = novaPosicao;
        this.podeReceberBonus = podeReceberBonus;
        this.irParaFerrovia = irParaFerrovia;
        this.irParaServicoPublico = irParaServicoPublico;
    }

    public int getNovaPosicao() {
        return novaPosicao;
    }

    public void setNovaPosicao(int novaPosicao) {
        this.novaPosicao = novaPosicao;
    }

    public boolean isPodeReceberBonus() {
        return podeReceberBonus;
    }

    public void setPodeReceberBonus(boolean podeReceberBonus) {
        this.podeReceberBonus = podeReceberBonus;
    }

    public boolean isIrParaFerrovia() {
        return irParaFerrovia;
    }

    public void setIrParaFerrovia(boolean irParaFerrovia) {
        this.irParaFerrovia = irParaFerrovia;
    }

    public boolean isIrParaServicoPublico() {
        return irParaServicoPublico;
    }

    public void setIrParaServicoPublico(boolean irParaServicoPublico) {
        this.irParaServicoPublico = irParaServicoPublico;
    }

    private Ferrovia encontrarFerroviaMaisProxima(int posicaoAtual, List<Ferrovia> ferrovias) {
        Ferrovia ferroviaMaisProxima = ferrovias.get(0);
        int menorDistancia = Math.min(
                (ferroviaMaisProxima.getPosicao() - posicaoAtual + 40) % 40,
                (posicaoAtual - ferroviaMaisProxima.getPosicao() + 40) % 40
        );

        for (Ferrovia ferrovia : ferrovias) {
            int distancia = Math.min(
                    (ferrovia.getPosicao() - posicaoAtual + 40) % 40,
                    (posicaoAtual - ferrovia.getPosicao() + 40) % 40
            );

            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                ferroviaMaisProxima = ferrovia;
            }
        }

        return ferroviaMaisProxima;
    }

    private ServicoPublico encontrarServicoMaisProximo(int posicaoAtual, List<ServicoPublico> servicoPublico) {
        ServicoPublico servicoMaisProximo = servicoPublico.get(0);
        int menorDistancia = Math.min(
                (servicoMaisProximo.getPosicao() - posicaoAtual + 40) % 40,
                (posicaoAtual - servicoMaisProximo.getPosicao() + 40) % 40
        );

        for (ServicoPublico servico : servicoPublico) {
            int distancia = Math.min(
                    (servico.getPosicao() - posicaoAtual + 40) % 40,
                    (posicaoAtual - servico.getPosicao() + 40) % 40
            );

            if (distancia < menorDistancia) {
                menorDistancia = distancia;
                servicoMaisProximo = servico;
            }
        }

        return servicoMaisProximo;
    }
    @Override
    public void executarAcao(Peca peca) {
        System.out.println("\nAvançando para " + getNovaPosicao() + ".");
        int posicaoAtual = peca.getPosicao();

        if(isIrParaFerrovia()){

            List<Ferrovia> ferrovias = peca.getFerrovias();
            Ferrovia ferroviaMaisProxima = encontrarFerroviaMaisProxima(posicaoAtual, ferrovias);
            peca.mover(ferroviaMaisProxima.getPosicao() - posicaoAtual);
            System.out.println("O peão avançou para " + ferroviaMaisProxima.getPosicao() + " – " + ferroviaMaisProxima.getNome() + ".");

        } else if (isIrParaServicoPublico()) {
            List<ServicoPublico> servicoPublicos = peca.getServicoPublico();
            ServicoPublico servicoMaisProximo = encontrarServicoMaisProximo(posicaoAtual, servicoPublicos);
            peca.mover(servicoMaisProximo.getPosicao() - posicaoAtual);
            System.out.println("O peão avançou para " + servicoMaisProximo.getPosicao() + " – " + servicoMaisProximo.getNome() + ".");

        } else {

            peca.mover(getNovaPosicao() - peca.getPosicao());
            System.out.println("O peão avançou para " + peca.getPosicao() + " – " + peca.getNomeDaCasa() + ".");

        }

        int bonus = 200;
        if(isPodeReceberBonus()){
            peca.getJogador().aumentarDinheiro(bonus);
        }
    }

}
