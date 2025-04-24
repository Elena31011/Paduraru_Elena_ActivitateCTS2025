package clase;

import java.util.HashMap;
import java.util.Map;

public class Produs implements IProdusMarketing {
    private String nume;
    private int varsta;
    private String afectiune;

    private static Produs instance =null;

    private  Produs(String nume, int varsta, String afectiune) {
        this.nume = nume;
        this.varsta = varsta;
        this.afectiune = afectiune;
    }

    public static Produs getInstance(String nume, int varsta, String afectiune) {
        if(instance ==null){
            instance=new Produs(nume, varsta, afectiune);
        }
        return instance;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", afectiune='").append(afectiune).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
