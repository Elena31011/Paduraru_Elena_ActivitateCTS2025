package main;

import clase.Cladire;
import clase.Macheta3D;
import clase.PrototypeMacheta3D;

public class Main {
    public static void main(String[] args) {
       Cladire cladire = new Cladire("Bloc", 2000, 55);
       Macheta3D macheta3D = PrototypeMacheta3D.getMacheta(cladire.getTipCladire());
       System.out.println(macheta3D);;
    }
}
