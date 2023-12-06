import java.util.ArrayList;

public class Tabuleiro {
    private ArrayList<Casa> casas;

    public Tabuleiro() {
        this.casas = new ArrayList<>();
        inicializarCasas();
    }

    private void inicializarCasas(){

        casas.add(new Propriedade(1, "Mediterranean Avenue", "roxo", 60,  2, 10, 30, 90, 160, 250, 30, 50));
        casas.add(new CofreComunitario(2, "Cofre Comunitário 1"));
        casas.add(new Propriedade(3, "Baltic Avenue", "roxo", 60,  4, 20, 60, 180, 320, 450, 30, 50));
        casas.add(new Sorte(4, "Income Tax"));
        casas.add(new Ferrovia(5, "Reading Railroad", 200, 100));
        casas.add(new Propriedade(6, "Oriental Avenue", "ciano", 100,  6, 30, 90, 270, 400, 550, 50, 50));
        casas.add(new Sorte(7, "Chance 1"));
        casas.add(new Propriedade(8, "Vermont Avenue", "ciano", 100, 6, 30, 90, 270, 400, 550, 50, 50));
        casas.add(new Propriedade(9, "Connecticut Avenue", "ciano", 120, 8, 40, 100, 300, 450, 600, 60, 50));
        casas.add(new Sorte(10, "Jail Just Visiting"));
        casas.add(new Propriedade(11, "St. Charles Place", "rosa", 140, 10, 50,150, 450, 625, 750, 70, 100));
        casas.add(new Sorte(12, "Eletric Company"));
        casas.add(new Propriedade(13, "States Avenue", "rosa", 140, 10, 50, 150, 450, 625, 750, 70, 100));
        casas.add(new Propriedade(14, "Virginia Avenue", "rosa", 160, 12, 60, 180, 500, 700, 900, 80, 100));
        casas.add(new Ferrovia(15, "Pennsylvania Railroad", 200, 100));
        casas.add(new Propriedade(16, "St. James Place", "laranja", 180, 14, 70, 200, 550, 750, 950, 90, 100));
        casas.add(new CofreComunitario(17, "Cofre Comunitário 2"));
        casas.add(new Propriedade(18, "Tennessee Avenue", "laranja", 180, 14, 70, 200, 550, 750, 950, 90, 100));
        casas.add(new Propriedade(19, "New York Avenue", "laranja", 200, 16, 80, 220, 600, 800, 1000, 100, 100));
        casas.add(new Sorte(20, "Free Parking"));
        casas.add(new Propriedade(21, "Kentucky Avenue", "vermelho", 220, 18, 90, 250, 700, 875, 1050, 110, 150));
        casas.add(new Sorte(22, "Chance 2"));
        casas.add(new Propriedade(23, "Indiana Avenue", "vermelho", 220, 18, 90, 250, 700, 875, 1050, 110, 150));
        casas.add(new Propriedade(24, "Illinois Avenue", "vermelho", 240, 20, 100, 300, 750, 925, 1100, 120, 150));
        casas.add(new Ferrovia(25, "B & O Railroad", 200, 100));
        casas.add(new Propriedade(26, "Atlantic Avenue", "amarelo", 260, 22, 110, 330, 800, 975, 1150, 130, 150));
        casas.add(new Propriedade(27, "Ventnor Avenue", "amarelo", 260, 22, 110, 330, 800, 975, 1150, 130, 150));
        casas.add(new Sorte(28, "Water Works"));
        casas.add(new Propriedade(29, "Marvin Gardens", "amarelo", 280, 24, 120, 360, 850, 1025, 1200, 140, 150));
        casas.add(new Sorte(30, "Go to Jail"));
        casas.add(new Propriedade(31, "Pacific Avenue", "verde", 300, 26, 130, 390, 900, 1100, 1275, 150, 200));
        casas.add(new Propriedade(32, "North Carolina Avenue", "verde", 300, 26, 130, 390, 900, 1100, 1275, 150, 200));
        casas.add(new Sorte(33, "Community Chest 3"));
        casas.add(new Propriedade(34, "Pennsylvania Avenue", "verde", 320, 28, 150, 450, 1000, 1200, 1400, 160, 200));
        casas.add(new Ferrovia(35, "Short Line", 200, 100));
        casas.add(new Sorte(36, "Chance 3"));
        casas.add(new Propriedade(37, "Park Place", "azul", 350, 35, 175, 500, 1100, 1300, 1500, 175, 200));
        casas.add(new Sorte(38, "Luxury Tax"));
        casas.add(new Propriedade(39, "Boardwalk", "azul", 400, 50, 200, 600, 1400, 1700, 2000, 200, 200));
        casas.add(new PontoDePartida(40, "GO"));

    }

    public Casa getCasaNaPosicao(int posicao) {
        for (Casa casa : casas) {
            if (casa.getPosicao() == posicao) {
                return casa;
            }
        }
        return null;
    }

}
