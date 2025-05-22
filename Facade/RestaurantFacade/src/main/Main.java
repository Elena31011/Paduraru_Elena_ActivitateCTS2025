package main;

import clase.Facade;
import clase.Masa;
import clase.Ospatar;
import clase.Picolo;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(4, true);
        Ospatar ospatar = new Ospatar();
        ospatar.EsteAranjata(masa);
        Picolo picolo = new Picolo();
        picolo.esteDebarasata(masa);
        Facade facade = new Facade();
        System.out.println(facade.verificareMasa(masa));
    }
}
