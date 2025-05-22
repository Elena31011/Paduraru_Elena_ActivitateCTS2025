package clase;

import java.util.HashMap;
import java.util.Map;

public class PachetFactory {
    private Map<Integer, IPersoana> pachetPersoana;

    public PachetFactory() {
        this.pachetPersoana = new HashMap<>();
    }

    public IPersoana getPersoana(String numeHotel, String destinatie, boolean micDejun, int cod) {
        if (!pachetPersoana.containsKey(cod)) {
            pachetPersoana.put(cod, new Persoana(numeHotel, destinatie, micDejun, cod));
        }
        return pachetPersoana.get(cod);
    }

    public IPersoana getPersoana(int cod) throws Exception {
        if(pachetPersoana.containsKey(cod)){
            return pachetPersoana.get(cod);
        }
        else {
            throw new Exception("Nu exista o persoana cu acest cod");
        }
    }
}
