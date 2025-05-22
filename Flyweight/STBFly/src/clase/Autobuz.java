package clase;

public class Autobuz implements IAutobuz {
    private String nrInmatriculare;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String nrInmatriculare, String model, int anFabricatie, int nrLocuri) {
        this.nrInmatriculare = nrInmatriculare;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Autobuz{");
        sb.append("nrInmatriculare='").append(nrInmatriculare).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii(Traseu t) {
        System.out.println(this.toString());
        System.out.println(t.toString());
    }
}
