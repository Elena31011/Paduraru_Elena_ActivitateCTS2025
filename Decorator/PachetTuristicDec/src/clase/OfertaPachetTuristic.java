package clase;

public abstract class OfertaPachetTuristic implements PachetTuristic {
    public abstract void anulareRezervare();
    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }


}
