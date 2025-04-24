package clase;

public class FisaPacient implements Cloneable{
    private int nrFisa;

     FisaPacient(Pacient pacient, int nrFisa) {
        this.nrFisa = nrFisa;
    }

    @Override
    public FisaPacient clone() {
        try {
            FisaPacient clone = (FisaPacient) super.clone();
            clone.nrFisa=this.nrFisa;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FisaPacient{");
        sb.append("nrFisa=").append(nrFisa);
        sb.append('}');
        return sb.toString();
    }
}
