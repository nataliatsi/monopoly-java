package casas.command;

import jogo.Peca;

public class ComandoSair implements Comando{
    @Override
    public void executar(Peca peca) {
        System.out.println("Comando Sair.");
    }
}
