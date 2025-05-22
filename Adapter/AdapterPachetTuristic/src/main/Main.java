package main;

import clase.Masina;
import clase.MasinaInchiriata;
import clase.PachetCazare;
import clase.PachetTuristic;

public class Main {
    private static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.println(" Pentru clientul ");
        pachetTuristic.descriere();
        System.out.println(" Pentru operator ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args) {


        Masina m1 = new Masina("Ford", 20);
        MasinaInchiriata masinaInchiriata = new MasinaInchiriata(m1);
        System.out.println(masinaInchiriata.toString());
        masinaInchiriata.inchiriazaMasina();

        PachetCazare pachetCazare = new PachetCazare();
        pachetCazare.descriere();
    }
}
