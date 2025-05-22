package main;

import clase.PachetFactory;
import clase.Preferinte;

public class Main {
    public static void main(String[] args) {
        PachetFactory pachetFactory = new PachetFactory();

        pachetFactory.getPersoana("Ala", "AbuDaby", true, 1);
        pachetFactory.getPersoana("Aldea", "Bacau", true, 2);

        Preferinte p1 = new Preferinte(2, true);
        Preferinte p2 = new Preferinte(3, false);

        try{
            pachetFactory.getPersoana(2).afiseazaInformatii(p1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
