package main;

import clase.IServiceConection;
import clase.RegistryDrone;

public class Main {
    public static void main(String[] args) {
        RegistryDrone registryDrone = new RegistryDrone();
        IServiceConection iServiceConection = registryDrone.getService(RegistryDrone.GPS_SERVICE);
        iServiceConection.connect();
        iServiceConection.display();
        IServiceConection iServiceConection1 = registryDrone.getService(RegistryDrone.GPS_SERVICE);
        iServiceConection1.connect();
        iServiceConection1.display();

        System.out.println(iServiceConection==iServiceConection1);
    }
}
