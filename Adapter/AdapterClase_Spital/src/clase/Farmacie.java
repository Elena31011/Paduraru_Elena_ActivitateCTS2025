package clase;

public class Farmacie {
    private String nume;

    public Farmacie(String nume){
        this.nume=nume;
    }

    public void vindeMedicament(IFarmacieMedicament farmacieMedicament){
        System.out.println("\n Farmacia "+ nume+" va oferi medicamentul: ");
        farmacieMedicament.cumparaMedicament();
    }
}
