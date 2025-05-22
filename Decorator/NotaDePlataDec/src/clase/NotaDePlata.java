package clase;

public class NotaDePlata implements INota{

    private float total;

    public NotaDePlata(float total) {
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    @Override
    public void printareNota() {
        System.out.println("Totalul de plata e "+ total+" RON");
    }
}
