package clase;

public class BuilderRestaurant {
    private boolean lageam;
    private boolean scauneE;
    private boolean decorareMasa;
    private boolean muzica;

    public BuilderRestaurant() {
        this.lageam = false;
        this.scauneE = false;
        this.decorareMasa = false;
        this.muzica = false;
    }

    public BuilderRestaurant setLageam(boolean lageam) {
        this.lageam = lageam;
        return this;
    }

    public BuilderRestaurant setScauneE(boolean scauneE) {
        this.scauneE = scauneE;
        return this;
    }

    public BuilderRestaurant setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
        return this;
    }

    public BuilderRestaurant setMuzica(boolean muzica) {
        this.muzica = muzica;
        return this;
    }

    public Restaurant build(){
      return new Restaurant(lageam,scauneE,decorareMasa,muzica);
    }
}
