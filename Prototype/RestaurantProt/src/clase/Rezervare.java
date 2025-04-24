package clase;

public class Rezervare implements Cloneable{
    private int nrRezervari;

     Rezervare(Restaurant restaurant,int nrMese) {
        this.nrRezervari = nrMese;
    }

    @Override
    public Rezervare clone() {
        try {
            Rezervare clone = (Rezervare) super.clone();
            clone.nrRezervari=this.nrRezervari;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Nu merge");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nrMese=").append(nrRezervari);
        sb.append('}');
        return sb.toString();
    }
}
