package clase;

public class Adapter extends MedicamentSpital implements IMedicamentFarmacie{


    public Adapter(String numeMed) {
        super(numeMed);
    }

    @Override
    public void cumparaMedicament() {
        super.achizitionareMedicament();
    }
}
