package clase;

import java.util.Map;

public class Macheta3D implements Cloneable{
   private int nrCamere;

    public Macheta3D(Cladire cladire,int nrCamere) {
        this.nrCamere = nrCamere;
    }

    @Override
    public Macheta3D clone() {
        try {
            Macheta3D clone = (Macheta3D) super.clone();
            clone.nrCamere =this.nrCamere;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Nu");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Macheta3D{");
        sb.append("nrCamere=").append(nrCamere);
        sb.append('}');
        return sb.toString();
    }
}
