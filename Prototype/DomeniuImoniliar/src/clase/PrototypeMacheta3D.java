package clase;

import java.util.HashMap;
import java.util.Map;

public class  PrototypeMacheta3D {
   private static Map<String, Macheta3D> colection = new HashMap<>();

   static {
       Cladire c = new Cladire("Bloc", 2000, 55);
       Cladire c1 = new Cladire("Casa", 2010, 40);
       Cladire c2 = new Cladire("Vila", 2020, 53);

       colection.put(c.getTipCladire(), new Macheta3D(c, 3));
       colection.put(c.getTipCladire(), new Macheta3D(c1, 4));
       colection.put(c.getTipCladire(), new Macheta3D(c2, 2));
   }

   public static Macheta3D getMacheta(String cheie){
       if(colection.containsKey(cheie)){
           return colection.get(cheie).clone();
       }
       else {
           throw new RuntimeException("Crapat");
       }
   }

}
