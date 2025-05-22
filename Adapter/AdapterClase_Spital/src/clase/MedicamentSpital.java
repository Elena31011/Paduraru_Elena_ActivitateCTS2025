package clase;

public class MedicamentSpital {
    private String denumireMedicament;
    private float pretReteta;

    public MedicamentSpital(String denumireMedicament, float pretReteta) {
        this.denumireMedicament = denumireMedicament;
        this.pretReteta = pretReteta;
    }

    public String getDenumireMedicament() {
        return denumireMedicament;
    }

    public float getPretReteta() {
        return pretReteta;
    }

    public void prezintaReteta(){
        System.out.println("Reteta prezinta medicamentul "+denumireMedicament);
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println(" aceasta costa"+ pretReteta);
    }

}
