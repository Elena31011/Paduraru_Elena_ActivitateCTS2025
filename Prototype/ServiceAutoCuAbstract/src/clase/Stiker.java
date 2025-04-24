package clase;

public class Stiker implements Cloneable{
    private int dim;

    Stiker(Masina masina, int dim) {
        this.dim = dim;
    }

    @Override
    public Stiker clone() {
        try {
            Stiker clone = (Stiker) super.clone();
            clone.dim=this.dim;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("clase.Stiker{");
        sb.append("dim=").append(dim);
        sb.append('}');
        return sb.toString();
    }
}
