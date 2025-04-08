package ro.acs.clase;

import java.util.HashMap;
import java.util.Map;

public class LiveEvenimentConnection {
    public static final  String FACEBOOK="FACEBOOK";
    public static final  String INSTAGRAM="INSTAGRAM";
    public static final  String SNAP="SNAP";
    private static Map<String, Live> collection = new HashMap<>();

    static {
        Live live =new Live("Live1", new byte[]{1,2,3});
        collection.put(FACEBOOK, live);
        collection.put(INSTAGRAM, live);
        collection.put(SNAP, live);
    }

    public AbstractLivePrototype getLive(String cheie) {
        if (collection.containsKey(cheie)) {
            return collection.get(cheie).clone();
        }
        else throw new RuntimeException("A crapat iar");
    }
}
