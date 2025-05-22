package clase;

public abstract class ImprimareDecorator implements Bilet{
    public abstract void imprimareMesaj();
    private Bilet bilet;

    public ImprimareDecorator(Bilet bilet) {
        this.bilet = bilet;
    }

    public Bilet getBilet() {
        return bilet;
    }

    @Override
    public void imprimare() {
        bilet.imprimare();
        imprimareMesaj();
    }
}
