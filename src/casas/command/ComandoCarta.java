package casas.command;

import jogo.Peca;

public class ComandoCarta implements Comando{
    @Override
    public void executar(Peca peca) {
        System.out.println("Comando Carta");
    }
}
