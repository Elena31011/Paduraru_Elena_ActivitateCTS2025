package clase;

import java.util.HashMap;
import java.util.Map;

public class ReceptyeFly {
    private Map<String,IClient> map;

    public ReceptyeFly() {
        this.map = new HashMap<>();
    }

    public IClient getIClient(String nume, String email){
        if(!map.containsKey(nume)){
            map.put(nume, new Client(nume, email));
        }
        return map.get(nume);
    }

    public IClient getIClient(String nume) throws Exception {
        if(map.containsKey(nume)) {
            return map.get(nume);
        }
        else {
            throw new Exception("Nu e un client cu acest nume");
        }
    }
}
