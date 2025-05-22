package main;

import clase.PachetTransport;
import clase.PachetTuristic;
import clase.Persoana;
import clase.ProxyPachet;

public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Ama", 17);
        System.out.println(p1);
        PachetTransport pachetTransport = new PachetTransport(p1);
        PachetTuristic pachetTuristicProxi = new ProxyPachet(pachetTransport);
        pachetTuristicProxi.rezervarePachet();
    }
}
