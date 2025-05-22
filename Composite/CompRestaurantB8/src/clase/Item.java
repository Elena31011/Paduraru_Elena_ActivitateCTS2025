package clase;

public class Item extends AMeniu{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriereMeniu() {
        System.out.println("Nume item :" + nume);
    }

    @Override
    public void adaugaNod(AMeniu item) {
        throw new UnsupportedOperationException("nu putem adauga nod");
    }

    @Override
    public void stergeNod(AMeniu item) {
        throw new UnsupportedOperationException("nu putem sterge nod");

    }

    @Override
    public AMeniu getNodCopil(int index) {
        throw new UnsupportedOperationException("nu putem avea copil nod");

    }
}
