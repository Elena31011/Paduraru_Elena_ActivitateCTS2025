package clase;

public class Cladire implements ICladire{
   private String tipCladire;
   private int anConstructie;
   private int suprafata;

    public Cladire(String tipCladire, int anConstructie, int suprafata) {
        this.tipCladire = tipCladire;
        this.anConstructie = anConstructie;
        this.suprafata = suprafata;
    }

    @Override
    public String getTipCladire() {
        return tipCladire;
    }

    @Override
    public int getAnConstructie() {
        return anConstructie;
    }

    @Override
    public int getSuprafataUtila() {
        return suprafata;
    }
}
