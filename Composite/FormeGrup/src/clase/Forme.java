package clase;

public class Forme implements IStructura {
    private String nume;

    public Forme(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStruct() {
        System.out.println("Forma: "+ nume);
    }

    @Override
    public void adaugaNod(IStructura iStructura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergereNod(IStructura iStructura) {
        throw new UnsupportedOperationException();

    }

    @Override
    public IStructura getCopilNod(int index) {
        throw new UnsupportedOperationException();
    }
}
