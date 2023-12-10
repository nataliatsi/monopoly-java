package casas.abstract_factory;

import casas.Propriedade;

public interface PropriedadeFactory {
    Propriedade criarPropriedade(int posicao, String nome, boolean estaNaPrisao, String grupo, int preco, int aluguelSemCasas,
                                 int aluguelComUmaCasa, int aluguelComDuasCasa, int aluguelComTresCasa, int aluguelComQuatroCasa,
                                 int hotel, int hipoteca, int precoDaCasa);
}
