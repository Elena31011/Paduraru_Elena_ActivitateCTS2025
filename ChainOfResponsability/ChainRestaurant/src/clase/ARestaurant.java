package clase;

public abstract class ARestaurant {
    protected ARestaurant urmatorul;

    public void setUrmatorul(ARestaurant urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(Client client);
}
