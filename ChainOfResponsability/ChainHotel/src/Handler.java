public abstract class Handler {
    private Handler urmatorul;

    public void setUrmatorul(Handler urmatorul) {
        this.urmatorul = urmatorul;
    }

    public Handler getUrmatorul() {
        return urmatorul;
    }

    public abstract void recomanda(Client client);
}


