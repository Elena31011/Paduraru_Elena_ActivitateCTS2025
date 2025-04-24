package main;

import clase.Produs;

public class Main {
    public static void main(String[] args) {
      Produs produs = Produs.getInstance("salam", 2, "au");
      Produs produs1 = Produs.getInstance("pizza", 3, "iu");

        System.out.println(produs1);
        System.out.println(produs1==produs);
    }
}
