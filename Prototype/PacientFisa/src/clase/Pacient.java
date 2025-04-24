package clase;

public class Pacient implements IPacient{
    private String nume;
    private int varsta;
    private String afectiune;

    public Pacient(String nume, int varsta, String afectiune) {
        this.nume = nume;
        this.varsta = varsta;
        this.afectiune = afectiune;
    }

    @Override
    public String getNume() {
        return "";
    }

    @Override
    public int getVarsta() {
        return 0;
    }

    @Override
    public String getAfectiunePrincipala() {
        return "";
    }
}
