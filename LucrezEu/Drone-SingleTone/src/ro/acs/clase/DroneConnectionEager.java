package ro.acs.clase;

public class DroneConnectionEager implements IDroneConnection{
    private String nume;
    private int ipAdress;
    private boolean isConnected;

    private static DroneConnectionEager instance = new DroneConnectionEager("Drona1", 8080, false);

    private DroneConnectionEager(String nume, int ipAdress, boolean isConnected) {
        this.nume = nume;
        this.ipAdress = ipAdress;
        this.isConnected = isConnected;
    }

    @Override
    public void connect() {
        isConnected=true;
        System.out.println("S-a conectat " + this.isConnected);
    }

    @Override
    public void disconnect() {
        isConnected=false;
        System.out.println(" Droana nu este conectata" + this.isConnected);
    }

    @Override
    public boolean isConnect() {
        if(isConnected==true){
            System.out.println("Drona e conectata" + this.isConnected);
            return true;
        }
        else{
            System.out.println(" Droana nu este conectata" + this.isConnected);
            return false;
        }
    }

    public static DroneConnectionEager getInstance() {
        return instance;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DroneConnection{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ipAdress=").append(ipAdress);
        sb.append(", isConnected=").append(isConnected);
        sb.append('}');
        return sb.toString();
    }
}
