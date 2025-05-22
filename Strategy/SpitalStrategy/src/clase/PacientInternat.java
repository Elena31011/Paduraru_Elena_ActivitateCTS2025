package clase;

public class PacientInternat {
    private String nume;
    private IMetodaPlata metodaPlata;

    public PacientInternat(String nume, IMetodaPlata metodaPlata) {
        this.nume = nume;
        this.metodaPlata = metodaPlata;
    }

    public PacientInternat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IMetodaPlata getMetodaPlata() {
        return metodaPlata;
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public void pacientPlateste(float pret) {
        System.out.println("Pacienta internata "+nume+" face o plata");
        metodaPlata.plateste(pret);
    }
}
