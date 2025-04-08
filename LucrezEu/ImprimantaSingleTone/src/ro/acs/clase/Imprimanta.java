package ro.acs.clase;

import java.sql.Struct;

public class Imprimanta extends AbstractImprimanta {

    private static Imprimanta instane = new Imprimanta(20, true, 8080);

    private Imprimanta(int nivelTon, boolean isColor, int ip) {
        this.nivelTon = nivelTon;
        this.isColor = isColor;
        this.ip = ip;
    }

    public static Imprimanta getInstane() {
        return instane;
    }

    @Override
    public int getNivelTon() {
        return 0;
    }

    @Override
    public boolean isColor() {
        return false;
    }

    @Override
    public int getIp() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imprimanta{");
        sb.append("nivelTon=").append(nivelTon);
        sb.append(", isColor=").append(isColor);
        sb.append(", ip=").append(ip);
        sb.append('}');
        return sb.toString();
    }
}
