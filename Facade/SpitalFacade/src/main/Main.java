package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Pat pat1 = new Pat(1, false);
        Pat pat2 = new Pat(2, false);
        Salon salon = new Salon();
        salon.adaugaPaturi(pat1);
        salon.adaugaPaturi(pat2);
        Pacient pacient1 = new Pacient("Ana", 7);
        Medic medic = new Medic();
        medic.interneazaPacient(pacient1);
        Facade facade = new Facade();
        System.out.println(facade.verificaDacaInternam(pacient1, salon));
    }
}
