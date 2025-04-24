package clase;

public class VremeService implements IServiceConection {

    private int versiune;

    VremeService() {
        this.versiune =10;
    }



    @Override
    public void connect() {
        System.out.println("Versiunea e actualizata");

    }

    @Override
    public void display() {
        System.out.println("versiunea" + this.versiune);

    }
}
