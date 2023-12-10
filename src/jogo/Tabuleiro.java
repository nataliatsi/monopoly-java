package jogo;

import casas.Sorte;
import casas.CofreComunitario;
import casas.*;
import casas.abstract_factory.*;
import casas.abstract_factory.concreta.*;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    private final ArrayList<Casa> casas;

    public Tabuleiro() {
        this.casas = new ArrayList<>();
        inicializarCasas();
    }

    private void inicializarCasas(){

        PropriedadeFactory propriedadeFactory = new PropriedadeFactoryConcreta();
        CofreComunitarioFactory cofreComunitarioFactory = new CofreComunitarioFactoryConcreta();
        FerroviaFactory ferroviaFactory = new FerroviaFactoryConcreta();
        ServicoPublicoFactory servicoPublicoFactory = new ServicoPublicoFactoryConcreta();
        SorteFactory sorteFactory = new SorteFactoryConcreta();

        casas.add(propriedadeFactory.criarPropriedade(1, "Mediterranean Avenue",  false, "roxo",  60,  2, 10, 30, 90, 160, 250, 30, 50));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(2, "Cofre Comunitário 1", false));
        casas.add(propriedadeFactory.criarPropriedade(3, "Baltic Avenue", false,"roxo", 60,  4, 20, 60, 180, 320, 450, 30, 50));
        casas.add(new CasaTeste(4, "Income Tax", false));
        casas.add(ferroviaFactory.criarFerrovia(5, "Reading Railroad", false, 200, 100));
        casas.add(propriedadeFactory.criarPropriedade(6, "Oriental Avenue", false,"ciano", 100,  6, 30, 90, 270, 400, 550, 50, 50));
        casas.add(sorteFactory.criarSorte(7, "Chance 1", false));
        casas.add(propriedadeFactory.criarPropriedade(8, "Vermont Avenue", false,"ciano", 100, 6, 30, 90, 270, 400, 550, 50, 50));
        casas.add(propriedadeFactory.criarPropriedade(9, "Connecticut Avenue", false,"ciano", 120, 8, 40, 100, 300, 450, 600, 60, 50));
        casas.add(new Prisao(10, "Prisão: Apenas Visitando", true, true));
        casas.add(propriedadeFactory.criarPropriedade(11, "St. Charles Place", false,"rosa", 140, 10, 50,150, 450, 625, 750, 70, 100));
        casas.add(servicoPublicoFactory.criarServicoPublico(12, "Companhia Elétrica", false, 150));
        casas.add(propriedadeFactory.criarPropriedade(13, "States Avenue", false, "rosa", 140, 10, 50, 150, 450, 625, 750, 70, 100));
        casas.add(propriedadeFactory.criarPropriedade(14, "Virginia Avenue", false,"rosa", 160, 12, 60, 180, 500, 700, 900, 80, 100));
        casas.add(ferroviaFactory.criarFerrovia(15, "Pennsylvania Railroad", false, 200, 100));
        casas.add(propriedadeFactory.criarPropriedade(16, "St. James Place", false,"laranja", 180, 14, 70, 200, 550, 750, 950, 90, 100));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(17, "Cofre Comunitário 2", false));
        casas.add(propriedadeFactory.criarPropriedade(18, "Tennessee Avenue", false,"laranja", 180, 14, 70, 200, 550, 750, 950, 90, 100));
        casas.add(propriedadeFactory.criarPropriedade(19, "New York Avenue", false,"laranja", 200, 16, 80, 220, 600, 800, 1000, 100, 100));
        casas.add(new CasaTeste(20, "Free Parking", false));
        casas.add(propriedadeFactory.criarPropriedade(21, "Kentucky Avenue", false,"vermelho", 220, 18, 90, 250, 700, 875, 1050, 110, 150));
        casas.add(sorteFactory.criarSorte(22, "Chance 2", false));
        casas.add(propriedadeFactory.criarPropriedade(23, "Indiana Avenue", false,"vermelho", 220, 18, 90, 250, 700, 875, 1050, 110, 150));
        casas.add(propriedadeFactory.criarPropriedade(24, "Illinois Avenue", false,"vermelho", 240, 20, 100, 300, 750, 925, 1100, 120, 150));
        casas.add(ferroviaFactory.criarFerrovia(25, "B & O Railroad", false,200, 100));
        casas.add(propriedadeFactory.criarPropriedade(26, "Atlantic Avenue", false,"amarelo", 260, 22, 110, 330, 800, 975, 1150, 130, 150));
        casas.add(propriedadeFactory.criarPropriedade(27, "Ventnor Avenue", false,"amarelo", 260, 22, 110, 330, 800, 975, 1150, 130, 150));
        casas.add(servicoPublicoFactory.criarServicoPublico(28, "Companhia de Água", false, 150));
        casas.add(propriedadeFactory.criarPropriedade(29, "Marvin Gardens", false,"amarelo", 280, 24, 120, 360, 850, 1025, 1200, 140, 150));
        casas.add(new Prisao(30, "Vá para Prisão", true, false));
        casas.add(propriedadeFactory.criarPropriedade(31, "Pacific Avenue", false,"verde", 300, 26, 130, 390, 900, 1100, 1275, 150, 200));
        casas.add(propriedadeFactory.criarPropriedade(32, "North Carolina Avenue", false,"verde", 300, 26, 130, 390, 900, 1100, 1275, 150, 200));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(33, "Cofre Comunitário 3", false));
        casas.add(propriedadeFactory.criarPropriedade(34, "Pennsylvania Avenue", false,"verde", 320, 28, 150, 450, 1000, 1200, 1400, 160, 200));
        casas.add(ferroviaFactory.criarFerrovia(35, "Short Line", false,200, 100));
        casas.add(sorteFactory.criarSorte(36, "Chance 3", false));
        casas.add(propriedadeFactory.criarPropriedade(37, "Park Place", false, "azul", 350, 35, 175, 500, 1100, 1300, 1500, 175, 200));
        casas.add(new CasaTeste(38, "Luxury Tax", false));
        casas.add(propriedadeFactory.criarPropriedade(39, "Boardwalk", false,"azul", 400, 50, 200, 600, 1400, 1700, 2000, 200, 200));
        casas.add(new PontoDePartida(40, "Ponto de Partida", false));

    }

    public Casa getCasaNaPosicao(int posicao) {
        for (Casa casa : casas) {
            if (casa.getPosicao() == posicao) {
                return casa;
            }
        }
        return null;
    }

    public List<Ferrovia> getFerrovias() {
        List<Ferrovia> ferrovias = new ArrayList<>();
        for (Casa casa : casas) {
            if (casa instanceof Ferrovia) {
                ferrovias.add((Ferrovia) casa);
            }
        }
        return ferrovias;
    }

    public List<ServicoPublico> getServicoPublico() {
        List<ServicoPublico> servicoPublicos = new ArrayList<>();
        for (Casa casa : casas) {
            if (casa instanceof ServicoPublico) {
                servicoPublicos.add((ServicoPublico) casa);
            }
        }
        return servicoPublicos;
    }

}
