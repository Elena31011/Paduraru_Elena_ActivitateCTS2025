package clase;

public class SupaLegume implements ISupe{
    private String nume;
    private int cantitate;

     SupaLegume(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public String getNume() {
        return "";
    }

    @Override
    public int getCantitate() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
