package clase;

public class Preferinte {
    private int nrExcursii;
    private boolean cina;

    public Preferinte(int nrExcursii, boolean cina) {
        this.nrExcursii = nrExcursii;
        this.cina = cina;
    }

    public int getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

    public boolean isCina() {
        return cina;
    }

    public void setCina(boolean cina) {
        this.cina = cina;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preferinte{");
        sb.append("nrExcursii=").append(nrExcursii);
        sb.append(", cina=").append(cina);
        sb.append('}');
        return sb.toString();
    }
}
