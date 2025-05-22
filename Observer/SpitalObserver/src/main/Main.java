package main;

import clase.Pacient;
import clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient p1 = new Pacient("Ana");
        Pacient p2 = new Pacient("Alina");
        Pacient p3 = new Pacient("Mara");

        Spital s1 = new Spital("Sf.Maria");

        s1.adaugaObservator(p1);
        s1.adaugaObservator(p2);
        s1.adaugaObservator(p3);

        s1.trimiteNotificare("S-a detectat un nou virus trimitem la urmatorii pacienti:");
    }
}
