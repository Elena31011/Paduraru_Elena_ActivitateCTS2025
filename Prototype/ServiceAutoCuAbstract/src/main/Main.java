package main;

import clase.Masina;
import clase.ProtoypeStiker;
import clase.Stiker;

public class Main {
    public static void main(String[] args) {
        Masina masina = new Masina("Audi", 2000);
        Stiker stiker = ProtoypeStiker.getStiker(masina.getModelMasina());
        System.out.println(stiker);
    }
}
