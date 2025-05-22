package clase;

public class Angajat implements ISectiune{
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereSectiune() {
        System.out.println("Angajatul cu numele de "+nume);
    }

    @Override
    public void adaugaNod(ISectiune iSectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereNod(ISectiune iSectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ISectiune getCopilNod(int index) {
        throw new UnsupportedOperationException();
    }
}
