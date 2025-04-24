package clase;

public class GPSService implements IServiceConection{
    private String type;

     GPSService() {
        this.type = "GPS2";
    }

    @Override
    public void connect() {
        System.out.println("Gps function");

    }

    @Override
    public void display() {
        System.out.println("type"+this.type);

    }
}
