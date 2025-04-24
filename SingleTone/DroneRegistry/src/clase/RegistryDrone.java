package clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryDrone {
    private static Map<String,IServiceConection> colection = new HashMap<>();

    public static final String CONTROL_BASE = "Baza";
    public static final String GPS_SERVICE = "GPSService";
    public static final String VREME_SERVICE="VremeService";

    static {
        colection.put(CONTROL_BASE, new BazaDeControl());
        colection.put(GPS_SERVICE, new GPSService());
        colection.put(VREME_SERVICE, new VremeService());
    }

    public IServiceConection getService(String cheie){
        if(colection.containsKey(cheie)){
            return colection.get(cheie);
        }
        else {
            throw new RuntimeException("Nu merge");
        }
    }
}
