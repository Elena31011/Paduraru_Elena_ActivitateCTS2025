package main;

import clase.ARecomandaMuzica;
import clase.RecomandaMuzicaConcentrata;
import clase.RecomandaMuzicaEnergica;
import clase.RecomandaMuzicaUsoara;

public class MainMuzicaChain {
    public static void main(String[] args) {
        ARecomandaMuzica concentrata = new RecomandaMuzicaConcentrata();
        ARecomandaMuzica energica = new RecomandaMuzicaEnergica();
        ARecomandaMuzica usoara = new RecomandaMuzicaUsoara();

        energica.setUrmatorul(concentrata);
        concentrata.setUrmatorul(usoara);

        energica.recomanda(12);
    }

}
