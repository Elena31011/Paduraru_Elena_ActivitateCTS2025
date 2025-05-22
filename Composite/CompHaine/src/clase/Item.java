package clase;

public class Item implements IHaine{
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    @Override
    public void descriere() {
        System.out.println(nume);
    }

    @Override
    public void adaugaNod(IHaine haine) {
        throw new UnsupportedOperationException("Nu poti adauga");
    }

    @Override
    public void stergeNod(IHaine haine) {
        throw new UnsupportedOperationException("Nu poti sterge");

    }

    @Override
    public void getNodCopil(int index) {
        throw new UnsupportedOperationException("Nu poti avea");

    }
}
