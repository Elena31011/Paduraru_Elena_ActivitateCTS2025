package clase;

import java.util.StringJoiner;

public class Rezervare {
    private int nrMasa;

    public Rezervare(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Rezervare.class.getSimpleName() + "[", "]")
                .add("nrMasa=" + nrMasa)
                .toString();
    }


}
