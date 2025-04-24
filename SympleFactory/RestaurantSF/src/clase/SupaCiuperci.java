package clase;

public class SupaCiuperci implements ISupe{
    private String nume;
    private int cantitate;

     SupaCiuperci(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public String getNume() {
        return "";
    }

    @Override
    public int getCantitate() {
        return 0;
    }
}
