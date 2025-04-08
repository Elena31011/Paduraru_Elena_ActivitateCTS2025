package ro.acs.clase;

public class DroneConectionLazy implements IDroneConnection{
    private String nume;
    private int ipAdress;
    private boolean isConnected;

    private static DroneConectionLazy instance = null;

    private DroneConectionLazy(String nume, int ipAdress, boolean isConnected) {
        this.nume = nume;
        this.ipAdress = ipAdress;
        this.isConnected = isConnected;
    }

    public synchronized static DroneConectionLazy getInstance() {
        if(instance==null){
            instance=new DroneConectionLazy("Drona2", 9090, false);
        }
        return instance;
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
            System.out.println("Drona e conectata " + this.isConnected);
            return true;
        }
        else{
            System.out.println(" Droana nu este conectata " + this.isConnected);
            return false;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DroneConectionLazy{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", ipAdress=").append(ipAdress);
        sb.append(", isConnected=").append(isConnected);
        sb.append('}');
        return sb.toString();
    }
}
