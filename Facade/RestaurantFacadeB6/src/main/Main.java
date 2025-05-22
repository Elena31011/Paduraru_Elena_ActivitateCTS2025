package main;

import clase.Facade;
import clase.Masa;
import clase.Ospatar;
import clase.Receptionist;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        Masa masa = new Masa(2, true);
        Ospatar ospatar = new Ospatar();
        ospatar.masaEsteAranjata(masa);
        Receptionist receptionist = new Receptionist();
        receptionist.masaELibera(masa);
        facade.verificareMasa(masa);
    }
}
