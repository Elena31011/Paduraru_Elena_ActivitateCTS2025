public class Client {
   private String nume;
    private String nrTel;
    private String email;

    public Client(String nume, String nrTel, String email) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTel() {
        return nrTel;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
