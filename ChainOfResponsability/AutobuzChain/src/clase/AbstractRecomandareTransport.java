package clase;

public abstract class AbstractRecomandareTransport {
    protected  AbstractRecomandareTransport urmatorul;

    public void setUrmatorul(AbstractRecomandareTransport urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(float distanta);
}
