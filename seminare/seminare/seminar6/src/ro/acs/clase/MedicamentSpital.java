package ro.acs.clase;

public class MedicamentSpital {
    private float pret;
    private String nume;

    public MedicamentSpital(float pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println((new StringBuilder(("Si a fost achizitionata la val de ")).append(this.pret)));
    }

    public void prezintaReteta(){
        System.out.println(new StringBuilder("E prez reteta pentru medicament").append(this.nume).toString());
    }

    public float getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }
}
