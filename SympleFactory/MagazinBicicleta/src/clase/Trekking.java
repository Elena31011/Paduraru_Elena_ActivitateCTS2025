package clase;

public class Trekking implements IBicicleta{
    private String tip;
    private double diametru;
    private String tipFrana;
    private boolean areCasca;
    private  boolean areOchelari;

     Trekking(String tip, double diametru, String tipFrana, boolean areCasca, boolean areOchelari) {
        this.tip = tip;
        this.diametru = diametru;
        this.tipFrana = tipFrana;
        this.areCasca = areCasca;
        this.areOchelari = areOchelari;
    }

    @Override
    public String getTip() {
        return tip;
    }

    @Override
    public double getDiametruRoti() {
        return diametru;
    }

    @Override
    public String getTipFrana() {
        return tipFrana;
    }

    @Override
    public boolean hasCascaProtectie() {
        return areCasca;
    }

    @Override
    public boolean hasOchelari() {
        return areOchelari;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Trekking{");
        sb.append("tip='").append(tip).append('\'');
        sb.append(", diametru=").append(diametru);
        sb.append(", tipFrana='").append(tipFrana).append('\'');
        sb.append(", areCasca=").append(areCasca);
        sb.append(", areOchelari=").append(areOchelari);
        sb.append('}');
        return sb.toString();
    }
}
