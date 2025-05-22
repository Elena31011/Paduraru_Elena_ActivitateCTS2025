package clase;

public abstract class AReclamatie {
    protected  AReclamatie urmatorul;

    public AReclamatie getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(AReclamatie urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(Client client);
}
