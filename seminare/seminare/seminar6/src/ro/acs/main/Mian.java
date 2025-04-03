package ro.acs.main;

import ro.acs.clase.AdapterMedicament;
import ro.acs.clase.MedicamentFarmacie;
import ro.acs.clase.MedicamentSpital;

public class Mian {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Farmacia noastra va ofera medicamentul: ");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args) {
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(40, "Parasinus", true);
        MedicamentFarmacie medicamentFarmacie1 = new MedicamentFarmacie(60, "Nurofen", false);

        vindeMedicament(medicamentFarmacie);
        vindeMedicament(medicamentFarmacie1);

        MedicamentSpital medicamentSpital=new MedicamentSpital(100, "Paduden");
        MedicamentSpital medicamentSpital1=new MedicamentSpital(200, "Aspenter");

        vindeMedicament(new AdapterMedicament(medicamentSpital));
        vindeMedicament(new AdapterMedicament(medicamentSpital1));
    }
}
