package main;

import clase.OfertaPachetCazare;
import clase.OfertaPachetTuristic;
import clase.PachetCazare;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {

        PachetTuristic pachetTuristic = new PachetCazare();

        pachetTuristic.descriere();
        System.out.println("Acest pachet nu poate fi anulat");
        System.out.println();

        OfertaPachetTuristic oferta = new OfertaPachetCazare(pachetTuristic);
        oferta.descriere();
        oferta.anulareRezervare();
    }
}
