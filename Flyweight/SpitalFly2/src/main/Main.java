package main;

import clase.ReceptieFly;
import clase.Spitalizare;

public class Main {
    public static void main(String[] args) {
        ReceptieFly receptieFly = new ReceptieFly();

        receptieFly.getPacient("qwe", "123","h6");
        receptieFly.getPacient("asd", "456","j7");

        Spitalizare s1 = new Spitalizare(1, 2, 4);
        Spitalizare s2 = new Spitalizare(3, 1, 2);

        try {
            receptieFly.getPacient("qwe").afiseazaInformatii(s1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
