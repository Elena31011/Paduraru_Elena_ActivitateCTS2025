package clase;

public class Client {
    private String nume;
    private IModPlata modPlata;

    public Client(String nume, IModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.modPlata = new Cash();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double sumaPlatita){
        modPlata.plateste(sumaPlatita);
    }
}
