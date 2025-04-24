package clase;

import java.util.HashMap;
import java.util.Map;

public class ProtoypeStiker {
    private static Map<String, Stiker> colection = new HashMap<>();

    static {
        Masina m = new Masina("Audi", 2000);
        Masina m2 = new Masina("W", 2020);

        colection.put(m.getModelMasina(), new Stiker(m, 5));
        colection.put(m2.getModelMasina(), new Stiker(m2, 3));
    }

    public static Stiker getStiker(String cheie){
        if(colection.containsKey(cheie)){
            return colection.get(cheie).clone();
        }
        else{
            throw new RuntimeException("NU MERGE");
        }
    }

}
