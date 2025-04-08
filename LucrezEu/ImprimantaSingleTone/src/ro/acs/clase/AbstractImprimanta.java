package ro.acs.clase;

public abstract class AbstractImprimanta {
    protected int nivelTon;
    protected boolean isColor;
    protected  int ip;

    public abstract int getNivelTon();
    public abstract boolean isColor();
    public abstract int getIp();
}
