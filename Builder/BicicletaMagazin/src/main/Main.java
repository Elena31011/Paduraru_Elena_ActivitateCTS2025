package main;

import clase.Bicicleta;
import clase.BicicletaBuilder;

public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new BicicletaBuilder().setAreCasca(true).build();
        System.out.println(bicicleta);
    }
}
