package clase;

public class AdapterClaseMedicament extends MedicamentSpital implements IFarmacieMedicament {
    public AdapterClaseMedicament(String denumireMedicament, float pretReteta) {
        super(denumireMedicament, pretReteta);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
