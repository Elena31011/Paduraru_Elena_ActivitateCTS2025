package ro.acs.clase;

public class ImprimataEager extends Aimprimanta {
    private String denumire;
    private int nivel;
    private boolean color;
    private int ip;

    private static ImprimataEager instance = new ImprimataEager("HP laser", 70, true, 12345);

    private ImprimataEager(String denumire, int nivel, boolean color, int ip) {
        this.denumire = denumire;
        this.nivel = nivel;
        this.color = color;
        this.ip = ip;
    }

    public static ImprimataEager getInstance() {
        return instance;
    }


    @Override
    public int getNivelToner() {
        return 0;
    }

    @Override
    public boolean isColor() {
        return false;
    }

    @Override
    public int getIP() {
        return 0;
    }

    public void printeaza(IDocument document) {
        System.out.println("Se printează documentul: " + document.getText());
        document.afisareDocument();
        System.out.println("Număr pagini: " + document.getNrPagini() + ", Color: " + document.isColor());
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ImprimataEager{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", color=").append(color);
        sb.append(", ip=").append(ip);
        sb.append('}');
        return sb.toString();
    }
}
