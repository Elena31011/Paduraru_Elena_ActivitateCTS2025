package clase;

public class Client {
    private String nume;
    private String reclamatie;

    public Client(String nume, String reclamatie) {
        this.nume = nume;
        this.reclamatie = reclamatie;
    }

    public Client(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getReclamatie() {
        return reclamatie;
    }

    public void setReclamatie(String reclamatie) {
        this.reclamatie = reclamatie;
    }

    public void DaReclamatie(String reclamatie){
        System.out.println("Clientul a dat " + getReclamatie());
    }
}
