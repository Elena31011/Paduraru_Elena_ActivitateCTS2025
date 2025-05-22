package main;

import clase.Departament;
import clase.IStructura;
import clase.Sectii;

public class MainSpitalComp {
    public static void main(String[] args) {
        IStructura spital = new Departament("Spital central");
        IStructura chirurgie = new Departament("Chirurgie");
        IStructura neurologie = new Departament("Neurologie");

        Sectii general = new Sectii("general");
        Sectii operatii = new Sectii("operatii");
        Sectii transplant = new Sectii("transplant");
        Sectii ct = new Sectii("ct");

        spital.adaugaNod(chirurgie);
        spital.adaugaNod(neurologie);

        chirurgie.adaugaNod(general);
        chirurgie.adaugaNod(operatii);
        chirurgie.adaugaNod(transplant);
        neurologie.adaugaNod(ct);

        spital.descriereStructura();
    }
}
