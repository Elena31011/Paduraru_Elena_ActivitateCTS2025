package clase;

import java.util.StringJoiner;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        super();
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Persoana.class.getSimpleName() + "[", "]")
                .add("nume='" + nume + "'")
                .add("varsta=" + varsta)
                .toString();
    }
}
