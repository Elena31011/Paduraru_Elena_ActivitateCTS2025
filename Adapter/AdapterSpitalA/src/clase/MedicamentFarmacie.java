package clase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private String numeMedicament;
    private float pret;

    public MedicamentFarmacie(String numeMedicament, float pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println(numeMedicament+" a fost cumparat la pretul de "+pret);
    }
}
