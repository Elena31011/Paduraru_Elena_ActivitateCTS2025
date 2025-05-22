package clase;

public class MedicamentSpital {
    private String numeMed;

    public MedicamentSpital(String numeMed) {
        this.numeMed = numeMed;
    }

    public void prezintaReteta() {
        System.out.println("A fost dat pe reteta");
    }

    public void achizitionareMedicament() {
        prezintaReteta();
    }
}

