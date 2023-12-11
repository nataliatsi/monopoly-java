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

        casas.add(propriedadeFactory.criarPropriedade(1, "Mediterranean Avenue",  false, "roxo",  60,  2));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(2, "Cofre Comunitário 1", false));
        casas.add(propriedadeFactory.criarPropriedade(3, "Baltic Avenue", false,"roxo", 60,  4));
        casas.add(new CasaTeste(4, "Income Tax", false));
        casas.add(ferroviaFactory.criarFerrovia(5, "Reading Railroad", false, 200, 0));
        casas.add(propriedadeFactory.criarPropriedade(6, "Oriental Avenue", false,"ciano", 100,  6));
        casas.add(sorteFactory.criarSorte(7, "Chance 1", false));
        casas.add(propriedadeFactory.criarPropriedade(8, "Vermont Avenue", false,"ciano", 100, 6));
        casas.add(propriedadeFactory.criarPropriedade(9, "Connecticut Avenue", false,"ciano", 120, 8));
        casas.add(new Prisao(10, "Prisão: Apenas Visitando", true, true));
        casas.add(propriedadeFactory.criarPropriedade(11, "St. Charles Place", false,"rosa", 140, 10));
        casas.add(servicoPublicoFactory.criarServicoPublico(12, "Companhia Elétrica", false, 150));
        casas.add(propriedadeFactory.criarPropriedade(13, "States Avenue", false, "rosa", 140, 10));
        casas.add(propriedadeFactory.criarPropriedade(14, "Virginia Avenue", false,"rosa", 160, 12));
        casas.add(ferroviaFactory.criarFerrovia(15, "Pennsylvania Railroad", false, 200, 0));
        casas.add(propriedadeFactory.criarPropriedade(16, "St. James Place", false,"laranja", 180, 14));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(17, "Cofre Comunitário 2", false));
        casas.add(propriedadeFactory.criarPropriedade(18, "Tennessee Avenue", false,"laranja", 180, 14));
        casas.add(propriedadeFactory.criarPropriedade(19, "New York Avenue", false,"laranja", 200, 16));
        casas.add(new CasaTeste(20, "Free Parking", false));
        casas.add(propriedadeFactory.criarPropriedade(21, "Kentucky Avenue", false,"vermelho", 220, 18));
        casas.add(sorteFactory.criarSorte(22, "Chance 2", false));
        casas.add(propriedadeFactory.criarPropriedade(23, "Indiana Avenue", false,"vermelho", 220, 18));
        casas.add(propriedadeFactory.criarPropriedade(24, "Illinois Avenue", false,"vermelho", 240, 20));
        casas.add(ferroviaFactory.criarFerrovia(25, "B & O Railroad", false,200, 0));
        casas.add(propriedadeFactory.criarPropriedade(26, "Atlantic Avenue", false,"amarelo", 260, 22));
        casas.add(propriedadeFactory.criarPropriedade(27, "Ventnor Avenue", false,"amarelo", 260, 22));
        casas.add(servicoPublicoFactory.criarServicoPublico(28, "Companhia de Água", false, 150));
        casas.add(propriedadeFactory.criarPropriedade(29, "Marvin Gardens", false,"amarelo", 280, 24));
        casas.add(new Prisao(30, "Vá para Prisão", true, false));
        casas.add(propriedadeFactory.criarPropriedade(31, "Pacific Avenue", false,"verde", 300, 26));
        casas.add(propriedadeFactory.criarPropriedade(32, "North Carolina Avenue", false,"verde", 300, 26));
        casas.add(cofreComunitarioFactory.criarCofreComunitario(33, "Cofre Comunitário 3", false));
        casas.add(propriedadeFactory.criarPropriedade(34, "Pennsylvania Avenue", false,"verde", 320, 28));
        casas.add(ferroviaFactory.criarFerrovia(35, "Short Line", false,200, 0));
        casas.add(sorteFactory.criarSorte(36, "Chance 3", false));
        casas.add(propriedadeFactory.criarPropriedade(37, "Park Place", false, "azul", 350, 35));
        casas.add(new CasaTeste(38, "Luxury Tax", false));
        casas.add(propriedadeFactory.criarPropriedade(39, "Boardwalk", false,"azul", 400, 50));
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
