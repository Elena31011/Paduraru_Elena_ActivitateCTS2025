package main;

import clase.Produs;

public class Main {
    public static void main(String[] args) {
    Produs p = Produs.getInstance("Salam", 2);
    Produs p2 = Produs.getInstance("hd", 3);

        System.out.println(p);

        System.out.println(p==p2);
    }
}
