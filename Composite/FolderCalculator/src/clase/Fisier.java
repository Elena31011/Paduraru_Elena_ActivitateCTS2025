package clase;

public class Fisier implements ISectiune{
    private String nume;

    public Fisier(String nume) {
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
        System.out.println("Fisierul "+nume);
    }

    @Override
    public void adaugaNod(ISectiune iSectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(ISectiune iSectiune) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ISectiune getCopilNod(int index) {
        throw new UnsupportedOperationException();
    }
}
