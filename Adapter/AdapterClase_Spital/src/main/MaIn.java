package main;

import clase.AdapterClaseMedicament;
import clase.Farmacie;
import clase.IFarmacieMedicament;
import clase.MedicamentFarmacie;

public class MaIn {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IFarmacieMedicament farmacieMedicament = new MedicamentFarmacie("Nurofen", 45.5f, true);
        farmacie.vindeMedicament(farmacieMedicament);

        AdapterClaseMedicament adapter = new AdapterClaseMedicament("Paduden", 45.3f);

        farmacie.vindeMedicament(adapter);
        System.out.println();
        adapter.achizitioneazaMedicament();
    }
}
