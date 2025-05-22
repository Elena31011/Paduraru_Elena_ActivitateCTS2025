package clase;

public class NotaPaste extends NotaDecorata{


    public NotaPaste(INota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Paste fericit!");
    }
}
