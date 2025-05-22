package main;

import clase.Angajat;
import clase.ISectiune;
import clase.Manager;

public class MainAngComp {
    public static void main(String[] args) {
        ISectiune manager = new Manager("Manager");

        ISectiune Bucatar = new Manager("Bucatar");
        ISectiune Chelner = new Manager("Chelner");

        Angajat andrei = new Angajat("Andrei");
        Angajat marin = new Angajat("Marin");
        Angajat mara = new Angajat("Mara");

        manager.adaugaNod(Bucatar);
        manager.adaugaNod(Chelner);

        Bucatar.adaugaNod(andrei);
        Chelner.adaugaNod(marin);
        Chelner.adaugaNod(mara);

        manager.descriereSectiune();

    }
}
