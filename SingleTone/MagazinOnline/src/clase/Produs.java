package clase;

public class Produs implements IProdusGeneric {

    private String denumire;
    private int cantitate;

    private static Produs instance = null;

    public static Produs getInstance(String denumire, int cantitate) {
        if(instance == null){
            instance=new Produs(denumire, cantitate);
        }
        return instance;
    }

    private Produs(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
    }

    @Override
    public String getDenumire() {
        return "";
    }

    @Override
    public int getCantitateSolutie() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
