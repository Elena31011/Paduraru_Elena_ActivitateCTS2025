package main;

import clase.PrototypeRezervare;
import clase.Restaurant;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant("Chinez", 3);
        Rezervare rezervare = PrototypeRezervare.getRezervare(r1.getNume());
        System.out.println(rezervare);
    }
}

