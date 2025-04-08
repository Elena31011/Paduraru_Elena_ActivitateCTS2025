package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistrySingleTone{
    public static final String meteoService="METEO";
    public static final String userService="USER";
    public static final String fabricatiobService="FABRICATION";
    private static Map<String, AbstractMicroService> registry = new HashMap<>();

   static {
       registry.put(meteoService, new MeteoService("serviceMeteo", "serviceMeteo.ro"));
       registry.put(userService, new UserService("serviceUser", "serviceUser.ro"));
       registry.put(fabricatiobService, new FabricationService("serviceFabrication", "serviceFabrication.ro"));
   }

   public AbstractMicroService getInstance(String cheie){
       if(registry.containsKey(cheie)){
           return registry.get(cheie);
       }
       else{
           throw new RuntimeException("NU AVEM O ASTFEL DE CONEXIUNE");
       }

   }
}
