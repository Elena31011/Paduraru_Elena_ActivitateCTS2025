package main;

import clase.Card;
import clase.Cash;
import clase.IMetodaPlata;
import clase.PacientInternat;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cash = new Cash();
        IMetodaPlata card  = new Card(300);

        PacientInternat p1 = new PacientInternat("ANA");
        p1.setMetodaPlata(card);

        card.plateste(50);
        System.out.println();
        cash.plateste(40);
        System.out.println();

        p1.pacientPlateste(30);
        System.out.println();
    }
}
