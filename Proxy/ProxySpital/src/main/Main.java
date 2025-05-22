package main;

import clase.IInternare;
import clase.Internare;
import clase.ProxyPacient;

public class Main {
    public static void main(String[] args) {

        Internare internare = new Internare();
        ProxyPacient pacient = new ProxyPacient(internare);
        pacient.internarePacient("Ana", true);
        pacient.internarePacient("Anca", false);
    }
}
