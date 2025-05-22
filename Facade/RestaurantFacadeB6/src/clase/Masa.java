package clase;

import java.util.StringJoiner;

public class Masa {
    private int nrMasa;
    private boolean esteLipera;

    public Masa(int nrMasa, boolean esteLipera) {
        this.nrMasa = nrMasa;
        this.esteLipera = esteLipera;
    }

    public int getNrMasa() {
        return nrMasa;
    }


    public boolean getEsteLipera() {
        return esteLipera;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Masa.class.getSimpleName() + "[", "]")
                .add("nrMasa=" + nrMasa)
                .add("esteLipera=" + esteLipera)
                .toString();
    }
}
