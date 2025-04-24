package clase;

public class Restaurant implements IRestaurant {

    private String nume;
    private int mese;

    public Restaurant(String nume, int mese) {
        this.nume = nume;
        this.mese = mese;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getMese() {
        return mese;
    }
}
