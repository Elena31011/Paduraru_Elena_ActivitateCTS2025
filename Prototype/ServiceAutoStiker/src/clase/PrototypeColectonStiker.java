package clase;

import java.util.HashMap;
import java.util.Map;

public class PrototypeColectonStiker {
    private static Map<String,Stiker> colection =new HashMap<>();
    static {
       Masina m = new Masina("Audi", 2000);
       Masina m1 = new Masina("BMW", 2012);
       Masina m2 = new Masina("Logan", 1999);
       Masina m3 = new Masina("W", 2005);

       colection.put(m.getModelMasina(), new Stiker(m, 5));
       colection.put(m1.getModelMasina(), new Stiker(m1, 6));
       colection.put(m2.getModelMasina(), new Stiker(m2, 7));
       colection.put(m3.getModelMasina(), new Stiker(m3, 4));
    }

    public static Stiker getStiker(String cheie) {
        if (colection.containsKey(cheie)){
            return colection.get(cheie).clone();
        }
        throw new RuntimeException("Moare");
    }
}
