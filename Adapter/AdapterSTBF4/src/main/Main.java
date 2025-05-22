package main;

import clase.AdaptorBilet;
import clase.BiletMetrou;
import clase.ControlBilet;
import clase.IBiletMetrou;

public class Main {
    public static void main(String[] args) {
        IBiletMetrou biletMetrou = new BiletMetrou(2);
        biletMetrou.validareBilet();

        AdaptorBilet adaptorBilet = new AdaptorBilet(2);
        adaptorBilet.validareBilet();
        adaptorBilet.validareBilet();
        adaptorBilet.validareBilet();

        ControlBilet controlBilet = new ControlBilet();
        controlBilet.verificareFinalaBilet(biletMetrou);
        controlBilet.verificareFinalaBilet(adaptorBilet);

    }
}
