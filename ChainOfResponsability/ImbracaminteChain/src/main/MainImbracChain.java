package main;

import clase.ARecomandareImbracaminte;
import clase.RecomandaHanorac;
import clase.RecomandaJacheta;
import clase.RecomandareGeaca;

public class MainImbracChain {
    public static void main(String[] args) {
        ARecomandareImbracaminte geaca = new RecomandareGeaca();
        ARecomandareImbracaminte jacheta = new RecomandaJacheta();
        ARecomandareImbracaminte hanorac = new RecomandaHanorac();

        geaca.setUrmatorul(jacheta);
        jacheta.setUrmatorul(hanorac);

        geaca.recomanda(20);
    }
}
