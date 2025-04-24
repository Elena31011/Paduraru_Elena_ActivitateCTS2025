package main;

import clase.BuilderSenzor;
import clase.Senzor;

public class Main {
    public static void main(String[] args) {
        Senzor senzor = new BuilderSenzor().setPm10(10).setTemperatura(20).build();
        System.out.println(senzor);
    }
}
