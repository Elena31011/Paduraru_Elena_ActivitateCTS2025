package main;

import clase.Autobuz;
import clase.Calator;
import clase.MijlocTransport;
import clase.Observator;

public class Main {
    public static void main(String[] args) {
        Observator c1 = new Calator("c1");
        Observator c2 = new Calator("c2");

        MijlocTransport autobuz = new Autobuz(2);
        autobuz.adaugaObservator(c1);
        autobuz.adaugaObservator(c2);

        autobuz.pleacaDeLaCapatLinie();
        autobuz.stergeObservator(c1);
        ((Autobuz)autobuz).schimbaTraseul();
    }
}
