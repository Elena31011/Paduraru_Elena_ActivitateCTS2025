package clase;

public abstract class ARecomandaMuzica {
    protected ARecomandaMuzica urmatorul;

    public void setUrmatorul(ARecomandaMuzica urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(int ora);
}
