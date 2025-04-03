package pb5SpitalClasa.clase;



public class Farmacie {
    private String nume;

    public Farmacie(String nume) {
        this.nume=nume;
    }

    public void vindeMedicament(IMedicamentFarmacie medicamentFarmacie) {
        System.out.println("Farmacia"+this.nume+"va ofera medicam");
        medicamentFarmacie.cumparaMedicament();
    }
}
