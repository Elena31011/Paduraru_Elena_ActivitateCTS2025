package main;

import clase.AMetrou;
import clase.Metrou;
import clase.MetrouSpecial;

public class MainStbTemp {
    public static void main(String[] args) {
        AMetrou metrou = new Metrou(2);
        AMetrou metrouSpecial = new MetrouSpecial();

        metrou.circulaTur();
        metrou.circulaRetur();
        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();

    }
}
