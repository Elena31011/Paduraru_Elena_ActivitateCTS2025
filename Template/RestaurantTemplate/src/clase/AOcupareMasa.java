package clase;

public abstract class AOcupareMasa {
    public abstract void curataMasa();
    public abstract void seAseazaServetele();
    public abstract void seAseazaTacamuri();
    public abstract void suntinvitatePersLaMasa();

    public final void asezareMasa(){
        curataMasa();
        seAseazaServetele();
        seAseazaTacamuri();
        suntinvitatePersLaMasa();
    }
}
