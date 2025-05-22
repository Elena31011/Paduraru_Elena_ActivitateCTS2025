package clase;

import java.util.StringJoiner;

public class Masa {
    private int nrMasa;
    private boolean esteLibera;

    public Masa(int nrMasa, boolean esteLibera) {
        this.nrMasa = nrMasa;
        this.esteLibera = esteLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Masa.class.getSimpleName() + "[", "]")
                .add("nrMasa=" + nrMasa)
                .add("esteLibera=" + esteLibera)
                .toString();
    }
}
