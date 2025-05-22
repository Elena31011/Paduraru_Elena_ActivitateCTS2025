package clase;

import java.util.HashMap;
import java.util.Map;

public class AutogaraFly {
    private Map<String, IAutobuz> mapAutobuz;

    public AutogaraFly() {
        this.mapAutobuz = new HashMap<>();
    }

    public IAutobuz getAutobuz(String nrInmatriculare, String model, int anFabricatie, int nrLocuri){
        if(!mapAutobuz.containsKey(nrInmatriculare)){
            mapAutobuz.put(nrInmatriculare, new Autobuz(nrInmatriculare, model, anFabricatie, nrLocuri));
        }
        return mapAutobuz.get(nrInmatriculare);
    }
    public IAutobuz getAutobuz(String nrInmatriculare) throws Exception {
        if(mapAutobuz.containsKey(nrInmatriculare)){
            return mapAutobuz.get(nrInmatriculare);
        }
        else{
            throw new Exception("Nu ex masina cu acest nr de inmatriculare");
        }
    }


}
