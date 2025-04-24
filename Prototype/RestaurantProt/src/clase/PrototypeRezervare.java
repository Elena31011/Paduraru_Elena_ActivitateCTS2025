package clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRezervare {
   private static Map<String, Rezervare> map = new HashMap<>();
    static {
        Restaurant r1 = new Restaurant("Chinez", 3);
        Restaurant r2 = new Restaurant("Japonez", 4);

        map.put(r1.getNume(), new Rezervare(r1,20 ));
        map.put(r2.getNume(), new Rezervare(r2, 3));
    }

    public static Rezervare getRezervare(String cheie){
        if(map.containsKey(cheie)){
            return map.get(cheie);
        }
        else throw new RuntimeException("Nu");
    }
}
