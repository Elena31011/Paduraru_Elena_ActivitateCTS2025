package clase;

public abstract class NotaDecorata implements INota {
    protected abstract void printareFelicitare();
    private INota nota;

    public NotaDecorata(INota nota) {
        this.nota = nota;
    }

    @Override
    public void printareNota() {
        nota.printareNota();
        printareFelicitare();
    }
}
