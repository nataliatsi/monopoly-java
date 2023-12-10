package casas;

import casas.command.*;
import jogo.Jogador;
import jogo.Peca;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Prisao extends Casa{
    private boolean visitandoPrisao;
    private Map<String, Comando> comandos;
    public Prisao(int posicao, String nome, boolean estaNaPrisao, boolean visitandoPrisao) {
        super(posicao, nome, estaNaPrisao);
        this.visitandoPrisao = visitandoPrisao;
        inicializarComandos();
    }

    private void inicializarComandos() {
        comandos = new HashMap<>();
        comandos.put("jogar", new ComandoJogar());
        comandos.put("pagar", new ComandoPagar());
        comandos.put("carta", new ComandoCarta());
        comandos.put("status", new ComandoStatus());
        comandos.put("sair", new ComandoSair());
    }

    private Comando criarComando(String comando) {
        return comandos.get(comando.toLowerCase());
    }
    public boolean isVisitandoPrisao() {
        return visitandoPrisao;
    }

    @Override
    public void oferecerCompra(Jogador jogador) {

    }

    @Override
    public void venderPara(Jogador jogador) {

    }

    @Override
    public void executarAcao(Peca peca) {
        if (!isVisitandoPrisao()) {
            System.out.println(" " + peca.getJogador().getNome() + " está na prisão.");
            Scanner scanner = new Scanner(System.in);
            int valorFianca = 50;

            while (peca.getJogadasSeguidas() < 3) {
                System.out.println("Comandos disponíveis: [pagar][carta][jogar][status][sair]");
                System.out.print("Entre com um comando: ");
                String comando = scanner.nextLine();

                Comando comandoObjeto = criarComando(comando);
                comandoObjeto.executar(peca);

                if ("sair".equalsIgnoreCase(comando)) {
                    break;
                }
            }

            if (peca.getJogadasSeguidas() == 3) {
                System.out.println("Você não conseguiu sair da prisão após 3 tentativas. Pagou $50.");
                peca.getJogador().diminuirDinheiro(valorFianca);
                peca.resetarJogadas();
            }
        } else {
            System.out.println(" " + peca.getJogador().getNome() + " está na prisão. Apenas visitando.");
        }
    }

    /*
    @Override
    public void executarAcao(Peca peca) {
        if(!isVisitandoPrisao()){
            System.out.println(" " + peca.getJogador().getNome() + " está na prisão.");
            Scanner scanner = new Scanner(System.in);
            int valorFianca = 50;

            while (peca.getJogadasSeguidas() < 3) {

                System.out.println("Comandos disponíveis: [pagar][carta][jogar][status][sair]");
                System.out.print("Entre com um comando: ");
                String comando = scanner.nextLine();

                if ("sair".equalsIgnoreCase(comando)) {
                } else if ("jogar".equalsIgnoreCase(comando)) {

                    int dado1 = lancarDado();
                    int dado2 = lancarDado();
                    System.out.println("O jogador " + peca.getJogador().getNome() + " tirou " + dado1 + "," + dado2);

                    if (dado1 == dado2) {

                        System.out.println("Você saiu da prisão!");
                        peca.resetarJogadas();
                        break;

                    } else {

                        System.out.println("Você não conseguiu sair da prisão.");
                        peca.incrementarJogadas();
                    }
                } else if ("pagar".equalsIgnoreCase(comando)) {

                    System.out.println("Você pagou para sair da prisão!");
                    peca.getJogador().diminuirDinheiro(valorFianca);
                    peca.resetarJogadas();
                    break;

                } else if ("carta".equalsIgnoreCase(comando)) {

                    System.out.println("Você usou uma carta para sair da prisão!");
                    peca.resetarJogadas();
                    break;

                } else if ("status".equalsIgnoreCase(comando)) {
                    peca.status();
                }
            }

            if (peca.getJogadasSeguidas() == 3) {
                System.out.println("Você não conseguiu sair da prisão após 3 tentativas. Pagou $50.");
                peca.getJogador().diminuirDinheiro(valorFianca);
                peca.resetarJogadas();
            }

        } else {
            System.out.println(peca.getJogador().getNome() + " está na prisão. Apenas visitando.");
        }
    }
     */
}
