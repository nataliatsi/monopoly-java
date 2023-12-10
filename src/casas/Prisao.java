package casas;

import casas.command.*;
import jogo.Jogador;
import jogo.Peca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Prisao extends Casa{
    private boolean visitandoPrisao;
    private Map<String, Comando> comandos;

    public Prisao(int posicao, String nome, boolean estaNaPrisao, boolean visitandoPrisao) {
        super(posicao, nome, estaNaPrisao);
        this.visitandoPrisao = visitandoPrisao;
        inicializarComandos();
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

    private void inicializarComandos() {
        comandos = new HashMap<>();
        comandos.put("jogar", new ComandoJogar());
        comandos.put("pagar", new ComandoPagar());
        comandos.put("carta", new ComandoCarta());
        comandos.put("status", new ComandoStatus());
        comandos.put("sair", new ComandoSair());
    }

    public Comando criarComando(String comando) {
        return comandos.get(comando.toLowerCase());
    }

    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

        if (!isVisitandoPrisao()) {
            System.out.println(" " + peca.getJogador().getNome() + " está na prisão.");

            Scanner scanner = new Scanner(System.in);
            int valorFianca = 50;

            while (peca.getJogadasSeguidas() < 3) {
                System.out.println("Comandos disponíveis: [pagar][carta][jogar][status][sair]");
                System.out.print("Entre com um comando: ");
                String comando = scanner.nextLine().toLowerCase();

                Comando comandoObjeto = criarComando(comando);

                if (comandoObjeto != null) {
                    comandoObjeto.executar(peca);
                } else {
                    System.out.println("Comando inválido. Tente novamente.");
                }

                if (peca.getJogador().getDinheiro() >= valorFianca || peca.getJogadasSeguidas() == 0) {
                    break;
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


    /*
    @Override
    public void executarAcao(Peca peca) {
        System.out.println(" e o peão avançou para " + getPosicao() + " – " + getNome());

        Dado dado = new Dado();

        if(!isVisitandoPrisao()){
            System.out.println(" " + peca.getJogador().getNome() + " está na prisão.");
            Scanner scanner = new Scanner(System.in);
            int valorFianca = 50;

            while (peca.getJogadasSeguidas() < 3) {

                System.out.println("Comandos disponíveis: [pagar][carta][jogar][status][sair]");
                System.out.print("Entre com um comando: ");
                String comando = scanner.nextLine();

                if ("sair".equalsIgnoreCase(comando)) {

                    System.out.print("\nVocê tem certeza de que quer sair (Sim/Não)? ");
                    String confirmacao = scanner.nextLine();

                    if ("Sim".equalsIgnoreCase(confirmacao)) {

                        System.out.println("\nAté a próxima!");
                        System.exit(0);

                    } else {
                        System.out.println("Continuando o jogo.\n");
                    }

                    // jogar dados
                } else if ("jogar".equalsIgnoreCase(comando)) {

                    int dado1 = dado.lancarDado();
                    int dado2 = dado.lancarDado();
                    int resultadoDados = dado1 + dado2;

                    System.out.println("O jogador " + peca.getJogador().getNome() + " tirou " + dado1 + "," + dado2 + " " + resultadoDados);

                    if (dado1 == dado2) {

                        System.out.println("Você tirou " + dado1 + "," + dado2);
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
                    peca.resetarJogadas();
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
