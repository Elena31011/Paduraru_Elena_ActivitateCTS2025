package ro.acs.main;
import ro.acs.clase.DroneConectionLazy;
import ro.acs.clase.DroneConnectionEager;

public class mainDrone {
    public static void main(String[] args) {
        DroneConnectionEager droneConnection = DroneConnectionEager.getInstance();
        droneConnection.connect();
        System.out.println(droneConnection);
        DroneConnectionEager droneConnection1 = ro.acs.clase.DroneConnectionEager.getInstance();
        System.out.println(droneConnection == droneConnection1);

        System.out.println("------LAZY------");
        DroneConectionLazy droneConectionLazy = DroneConectionLazy.getInstance();
        droneConectionLazy.isConnect();
        System.out.println(droneConectionLazy);
    }
}
