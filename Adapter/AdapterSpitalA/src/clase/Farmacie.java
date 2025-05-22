package clase;

public class Farmacie {
    private String numeFarmacie;

    public void vindeMedicament(IMedicamentFarmacie farmacie){
        System.out.println("Farmacia a vandut medicament");
        farmacie.cumparaMedicament();
    }
}
