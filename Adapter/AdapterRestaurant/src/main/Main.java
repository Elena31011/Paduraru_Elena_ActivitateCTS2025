package main;

import clase.AdapterClase;
import clase.Comanda;
import clase.IFacturaBar;
import clase.PrintareFacturiBar;

public class Main {
    public static void main(String[] args) {

        Comanda c1 = new Comanda("comanda1");
        IFacturaBar facturaBar = new PrintareFacturiBar("Suc", 20);
        c1.comandaTerminata();

        AdapterClase adapterClase = new AdapterClase("Pere", 5);
        facturaBar.imprimare();
        adapterClase.imprimare();
    }
}
