package clase;

public class SupaVita implements ISupe {
    private String nume;
    private int cantitate;

     SupaVita(String nume, int cantitate) {
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
}
