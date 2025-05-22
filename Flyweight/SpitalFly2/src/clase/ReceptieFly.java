package clase;

import java.util.HashMap;
import java.util.Map;

public class ReceptieFly {
    private Map<String, IPacient> pacientMap;

    public ReceptieFly() {
        this.pacientMap = new HashMap<>();
    }

    public IPacient getPacient(String nume, String nrTelefon, String adresa){
        if(!pacientMap.containsKey(nume)){
            pacientMap.put(nume, new Pacient(nume, nrTelefon, adresa));
        }
        return pacientMap.get(nume);
    }

    public IPacient getPacient(String nume) throws Exception {
        if(pacientMap.containsKey(nume)){
            return pacientMap.get(nume);
        }
        else{
            throw new Exception("Nu exista un pacient cu numele asta");
        }
    }
}
