package clase;

public class NotaCraciun extends NotaDecorata{

    public NotaCraciun(INota nota) {
        super(nota);
    }

    @Override
    protected void printareFelicitare() {
        System.out.println("Craciun fericit!");
    }
}
