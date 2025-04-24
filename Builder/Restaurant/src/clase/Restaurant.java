package clase;

public class Restaurant {
    private boolean lageam;
    private boolean scauneE;
    private boolean decorareMasa;
    private boolean muzica;

    protected Restaurant(boolean lageam, boolean scauneE, boolean decorareMasa, boolean muzica) {
        this.lageam = lageam;
        this.scauneE = scauneE;
        this.decorareMasa = decorareMasa;
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("lageam=").append(lageam);
        sb.append(", scauneE=").append(scauneE);
        sb.append(", decorareMasa=").append(decorareMasa);
        sb.append(", muzica=").append(muzica);
        sb.append('}');
        return sb.toString();
    }
}
