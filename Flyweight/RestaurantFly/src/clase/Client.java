package clase;

public class Client implements IClient{
    private String nume;
    private int nrTelefon;
    private String mail;

    public Client(String nume, int nrTelefon, String mail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.mail = mail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", mail='").append(mail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii(Rezervare r) {
        System.out.println(this.toString());
        System.out.println(r.toString());
    }
}
