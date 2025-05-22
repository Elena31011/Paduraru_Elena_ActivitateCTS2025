package clase;

public class Pacient implements Observator{
   private  String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare() {
        System.out.println("Pacientul cu numele "+ nume+" a primit notificare");
    }
}
