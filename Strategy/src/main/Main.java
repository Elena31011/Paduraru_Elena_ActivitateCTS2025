package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new CardCalatorie(1);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Maria");
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);

    }
}
