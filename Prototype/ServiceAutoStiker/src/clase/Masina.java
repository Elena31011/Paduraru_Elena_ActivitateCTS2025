package clase;

public class Masina implements IMasina{
    private String model;
    private int an;

    public Masina(String model, int an) {
        this.model = model;
        this.an = an;
    }

    @Override
    public String getModelMasina() {
        return model;
    }

    @Override
    public int getAnFabricatie() {
        return an;
    }
}
