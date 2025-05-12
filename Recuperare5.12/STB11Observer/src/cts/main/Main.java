package cts.main;

import cts.clase.Autobuz;
import cts.clase.Calator;
import cts.clase.MijlocTransport;
import cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer c1 = new Calator("calator 1: ");
        Observer c2 = new Calator("calator 2: ");
        Observer c3 = new Calator("calator 3: ");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(c1);
        autobuz.adaugaObserver(c2);
        autobuz.adaugaObserver(c3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(c2);
        ((Autobuz)autobuz).schimbaTraseu();

    }
}
