package clase;

public class BazaDeControl implements IServiceConection{
    private String name;

    BazaDeControl() {
        this.name = "Baza";
    }

    @Override
    public void connect() {
        System.out.println("Baza de control connect");
    }

    @Override
    public void display() {
        System.out.println("nume"+this.name);
    }
}
