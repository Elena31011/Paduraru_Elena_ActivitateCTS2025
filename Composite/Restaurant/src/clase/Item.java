package clase;

public class Item implements IStructura {
    private String nume;

    public Item(String nume) {
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
        System.out.println("Itemul "+nume);
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
