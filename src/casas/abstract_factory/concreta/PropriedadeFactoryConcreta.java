package casas.abstract_factory.concreta;

import casas.Propriedade;
import casas.abstract_factory.PropriedadeFactory;

public class PropriedadeFactoryConcreta implements PropriedadeFactory {
    @Override
    public Propriedade criarPropriedade(int posicao, String nome, boolean estaNaPrisao, String grupo, int preco, int aluguelSemCasas, int aluguelComUmaCasa, int aluguelComDuasCasa, int aluguelComTresCasa, int aluguelComQuatroCasa, int hotel, int hipoteca, int precoDaCasa) {
        return new Propriedade(posicao, nome, estaNaPrisao, grupo, preco, aluguelSemCasas,aluguelComUmaCasa, aluguelComDuasCasa, aluguelComTresCasa, aluguelComQuatroCasa, hotel, hipoteca, precoDaCasa);
    }
}
