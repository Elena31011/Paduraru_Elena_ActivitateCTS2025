package clase;

public class Calator implements Observator{
    private String nume;

    public Calator(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(this.nume + " ai primit un mesaj " + mesaj );
    }
}
