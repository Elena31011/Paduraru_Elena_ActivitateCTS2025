package pb5SpitalClasa.clase;

import ro.acs.clase.MedicamentFarmacie;
import ro.acs.clase.MedicamentSpital;

public class AdapterClaseMedicament extends MedicamentSpital implements IMedicamentFarmacie {

    public AdapterClaseMedicament(float pret, String nume){
        super(pret,nume);

    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
