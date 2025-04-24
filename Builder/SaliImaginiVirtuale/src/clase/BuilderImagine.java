package clase;

import java.nio.file.attribute.AclEntry;

public class BuilderImagine implements IImagineVirtuala {

    private String nume;
    private int dimensiune;
    private boolean eActivaLicenta;

    public BuilderImagine() {
        this.nume = null;
        this.dimensiune = 0;
        this.eActivaLicenta = false;
    }

    @Override
    public String getNumeImagine() {
        return "";
    }

    @Override
    public int getDimensiuneGB() {
        return 0;
    }

    @Override
    public boolean isActivataLicentaWindows() {
        return false;
    }

    public BuilderImagine setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public BuilderImagine setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
        return this;
    }

    public BuilderImagine seteActivaLicenta(boolean eActivaLicenta) {
        this.eActivaLicenta = eActivaLicenta;
        return this;
    }

    public Imagine build(){
        return new Imagine(nume, dimensiune, eActivaLicenta);
    }
}
