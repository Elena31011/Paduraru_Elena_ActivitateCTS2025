package clase;

public class Sectii implements IStructura{
    private String nume;

    public Sectii(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereStructura() {
        System.out.println(nume);
    }

    @Override
    public void adaugaNod(IStructura iStructura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(IStructura iStructura) {
        throw new UnsupportedOperationException();
    }

    @Override
    public IStructura getCopilNod(int index) {
        throw new UnsupportedOperationException();
    }
}
