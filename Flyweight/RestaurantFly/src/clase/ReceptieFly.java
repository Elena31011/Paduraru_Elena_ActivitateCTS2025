package clase;

import java.util.HashMap;
import java.util.Map;

public class ReceptieFly {
    private Map<String, IClient> clientMap;

    public ReceptieFly() {
        this.clientMap = new HashMap<>();
    }

    public IClient getClient(String nume, int nrTelefon, String mail){
        if(!clientMap.containsKey(nume)){
            clientMap.put(nume, new Client(nume, nrTelefon, mail));
        }
        return clientMap.get(nume);
    }

    public IClient getClient(String nume) throws Exception {
        if(clientMap.containsKey(nume)){
            return clientMap.get(nume);
        }
        else{
            throw new Exception("Nu ex un client cu acest nume");
        }
    }
}
