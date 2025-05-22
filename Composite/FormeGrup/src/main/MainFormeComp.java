package main;

import clase.Forme;
import clase.Grup;
import clase.IStructura;

public class MainFormeComp {
    public static void main(String[] args) {
        IStructura grupForme = new Grup("Grup forme");

        IStructura formeGeometrice = new Grup("Geometrie");
        IStructura formeAnimale = new Grup("Animale");

        Forme cerc = new Forme("Cerc");
        Forme patrat = new Forme("Patrat");
        Forme triungi = new Forme("Triunghi");

        Forme pisica = new Forme("Pisica");

        grupForme.adaugaNod(formeGeometrice);
        grupForme.adaugaNod(formeAnimale);

        formeGeometrice.adaugaNod(cerc);
        formeGeometrice.adaugaNod(patrat);
        formeGeometrice.adaugaNod(triungi);

        formeAnimale.adaugaNod(pisica);

        grupForme.descriereStruct();

        System.out.println("Stergem o forma");
        formeGeometrice.stergereNod(triungi);
        grupForme.descriereStruct();
    }
}
