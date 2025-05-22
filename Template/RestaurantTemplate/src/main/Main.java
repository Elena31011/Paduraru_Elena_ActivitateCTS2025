package main;

import clase.AOcupareMasa;
import clase.MasaDeBogati;
import clase.MasaFastFOOD;

public class Main {
    public static void main(String[] args) {
        AOcupareMasa masaBogati = new MasaDeBogati();
        AOcupareMasa masaFastFood = new MasaFastFOOD();

        System.out.println("Masa bogati");
        masaBogati.asezareMasa();
        System.out.println();
        System.out.println("Masa fast food");
        masaFastFood.asezareMasa();
    }
}
