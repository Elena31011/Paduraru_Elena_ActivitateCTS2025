package pb5SpitalClasa.main;

import pb5SpitalClasa.clase.*;
import ro.acs.clase.AdapterMedicament;

public class Main {
    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie("Catena");
        IMedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie(100," Paduden",true);

        farmacie.vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital(19," Nurofen");

        AdapterClaseMedicament adapterClaseMedicament = new AdapterClaseMedicament(20," Aspenter");
        farmacie.vindeMedicament(adapterClaseMedicament);
        adapterClaseMedicament.cumparaMedicament();
    }
}
