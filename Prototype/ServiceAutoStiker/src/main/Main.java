package main;

import clase.Masina;
import clase.PrototypeColectonStiker;
import clase.Stiker;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Audi", 2000);
        Stiker stiker = PrototypeColectonStiker.getStiker("Audi");
        System.out.println(stiker.toString());
    }
}
