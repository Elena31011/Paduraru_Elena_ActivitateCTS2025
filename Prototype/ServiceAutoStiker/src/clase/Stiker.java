package clase;

public class Stiker implements Cloneable{
    private int dimensiune;
    Stiker(Masina masina, int dimensiune) {
        this.dimensiune=dimensiune;
    }

    @Override
    public Stiker clone() {
        try {
            Stiker clone = (Stiker) super.clone();
            clone.dimensiune = this.dimensiune;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Nu merge");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Stiker{");
        sb.append("dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
