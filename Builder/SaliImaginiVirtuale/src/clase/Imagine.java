package clase;

public class Imagine implements IImagineVirtuala{
    private String nume;
    private int dimensiune;
    private boolean eActivaLicenta;

    protected Imagine(String nume, int dimensiune, boolean eActivaLicenta) {
        this.nume = nume;
        this.dimensiune = dimensiune;
        this.eActivaLicenta = eActivaLicenta;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imagine{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", eActivaLicenta=").append(eActivaLicenta);
        sb.append('}');
        return sb.toString();
    }
}
