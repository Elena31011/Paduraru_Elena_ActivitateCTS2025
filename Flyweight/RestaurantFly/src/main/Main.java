package main;

import clase.ReceptieFly;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ReceptieFly receptie = new ReceptieFly();

        receptie.getClient("ana", 123, "we@12");
        receptie.getClient("mara", 456, "er@3");

        Rezervare r1 = new Rezervare(1, 2,"12:20");
        Rezervare r2 = new Rezervare(2, 4,"11:50");

        try {
            receptie.getClient("ana").afiseazaInformatii(r1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
