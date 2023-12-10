package casas.command;

import jogo.Peca;

public class ComandoJogar implements Comando{
    @Override
    public void executar(Peca peca) {
        System.out.println("Comando Jogar");
    }
}
