package clase;

public class NotaAnNou extends NotaDecorata{

    public NotaAnNou(INota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("An nou fericit!");
    }
}
