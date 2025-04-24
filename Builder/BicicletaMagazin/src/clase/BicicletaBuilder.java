package clase;

public class BicicletaBuilder {
    private String tip;
    private double diametru;
    private String tipFrana;
    private boolean areCasca;
    private  boolean areOchelari;

    public BicicletaBuilder() {
    }

    public BicicletaBuilder setTip(String tip) {
        this.tip = tip;
        return this;
    }

    public BicicletaBuilder setDiametru(double diametru) {
        this.diametru = diametru;
        return this;
    }

    public BicicletaBuilder setTipFrana(String tipFrana) {
        this.tipFrana = tipFrana;
        return this;
    }

    public BicicletaBuilder setAreCasca(boolean areCasca) {
        this.areCasca = areCasca;
        return this;
    }

    public BicicletaBuilder setAreOchelari(boolean areOchelari) {
        this.areOchelari = areOchelari;
        return this;
    }

    public Bicicleta build(){
        return new Bicicleta(tip, diametru, tipFrana, areCasca, areOchelari);
    }

}
