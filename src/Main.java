import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o número de jogadores [2-8]: ");
        int numJogadores = scanner.nextInt();
        scanner.nextLine();
        if (numJogadores < 2 || numJogadores > 8) {
            System.out.println("Número de jogadores inválido. O jogo requer entre 2 e 8 jogadores.");
            return;
        }

        List<Jogador> jogadores = new ArrayList<>();
        List<String> addCores = Arrays.asList("preto", "branco", "vermelho", "verde", "azul", "amarelo", "laranja", "rosa");
        List<String> cores = new ArrayList<>(addCores);

        for (int i = 1; i <= numJogadores; i++) {
            System.out.print("Entre com o nome do jogador no. " + i + ": ");
            String jogadorNome = scanner.nextLine();

            System.out.println("Escolha a cor do peão do jogador no. " + i + " entre as opções seguintes:");
            System.out.println(cores);

            String jogadorCor;
            do {
                System.out.print(": ");
                jogadorCor = scanner.nextLine();

                if (!cores.contains(jogadorCor)) {
                    System.out.println("Cor inválida. Escolha uma cor disponível.");
                }
            } while (!cores.contains(jogadorCor));

            cores.remove(jogadorCor);

            jogadores.add(new Jogador(jogadorNome, jogadorCor, 0));
        }

        System.out.println("O jogo Monopoly foi iniciado.");

        int jogadorAtual = 0;
        boolean jogoEncerrado = false;

        while (!jogoEncerrado) {
            Jogador jogador = jogadores.get(jogadorAtual);

            System.out.println("A jogada de " + jogador.getNome() + " começou.");
            System.out.println("Comandos disponíveis: [jogar][sair]");
            System.out.print("Entre com um comando: ");
            String comando = scanner.nextLine();

            if ("sair".equalsIgnoreCase(comando)) {
                System.out.print("Você tem certeza de que quer sair (Sim/Não)? ");
                String confirmacao = scanner.nextLine();
                if ("Sim".equalsIgnoreCase(confirmacao)) {
                    System.out.println("Jogo encerrado.");
                    jogoEncerrado = true;
                } else {
                    System.out.println("Continuando o jogo.");
                }
            } else if ("jogar".equalsIgnoreCase(comando)) {

                int dado1 = lancarDado();
                int dado2 = lancarDado();
                int resultadoDados = dado1 + dado2;

                System.out.println("O jogador " + jogador.getNome() + " tirou " + dado1 + "," + dado2 +
                        " e o peão avançou para " + resultadoDados +  ".");

                int novaPosicao = (jogador.getPosicao() + resultadoDados) % 40;
                jogador.setPosicao(novaPosicao);

                tratarConsequencias(jogador, resultadoDados);

                jogadorAtual = (jogadorAtual + 1) % numJogadores;
            }
        }

        scanner.close();
    }

    private static int lancarDado() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    private static void tratarConsequencias(Jogador jogador, int resultadoDados) {
        // Lógica para determinar o que acontece com o jogador com base no resultado dos dados
        System.out.println("Nada aconteceu.");
    }

}