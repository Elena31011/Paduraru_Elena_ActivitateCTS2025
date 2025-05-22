package main;

import clase.Adapter;
import clase.Farmacie;
import clase.IMedicamentFarmacie;
import clase.MedicamentFarmacie;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter("Nurofen");
        adapter.achizitionareMedicament();
        adapter.cumparaMedicament();

        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Pastila", 10.5f);
        medicamentFarmacie.cumparaMedicament();

        Farmacie farmacie = new Farmacie();
        farmacie.vindeMedicament(adapter);
        farmacie.vindeMedicament(medicamentFarmacie);
    }
}
