package clase;

import java.util.StringJoiner;

public class Autobuz {
    private String usaF;
    private String usaS;
    private String usaM;

    public Autobuz(String usaF, String usaS, String usaM) {
        this.usaF = usaF;
        this.usaS = usaS;
        this.usaM = usaM;
    }

    public String getUsaF() {
        return usaF;
    }

    public String getUsaS() {
        return usaS;
    }

    public String getUsaM() {
        return usaM;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Autobuz.class.getSimpleName() + "[", "]")
                .add("usaF='" + usaF + "'")
                .add("usaS='" + usaS + "'")
                .add("usaM='" + usaM + "'")
                .toString();
    }
}
