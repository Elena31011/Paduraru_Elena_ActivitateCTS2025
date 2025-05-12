package cts.acs.main;

import cts.acs.clase.Calator;
import cts.acs.clase.CardCalatorie;
import cts.acs.clase.IMetodaPlata;
import cts.acs.clase.PlataSMS;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(1);

        Calator c1 = new Calator("Corina", metodaPlataCardCalatorie);
        c1.platestBilet(5);
        c1.setMetodaPlata(new PlataSMS());
        c1.platestBilet(5);
        c1.setMetodaPlata(metodaPlataCardCalatorie);
        c1.platestBilet(5);
    }
}
