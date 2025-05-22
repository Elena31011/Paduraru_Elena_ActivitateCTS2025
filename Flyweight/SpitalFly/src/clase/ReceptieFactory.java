package clase;

import java.util.HashMap;
import java.util.Map;

public class ReceptieFactory {
    //retine datele imp despre tine
    private Map<String, IPacientAbstract> pacientSpitalizare;

    public ReceptieFactory() {
        this.pacientSpitalizare = new HashMap<>();
    }

    public IPacientAbstract getPacient(String nume, String numarTelefon, String adresa) {
        //daca e pacient nou prima data il adaug la hashMap
        if (!pacientSpitalizare.containsKey(nume)) {
            pacientSpitalizare.put(nume, new Pacient(nume, numarTelefon, adresa));
        }
        return pacientSpitalizare.get(nume);
    }

    public IPacientAbstract getPacient(String nume) throws Exception {
        if(pacientSpitalizare.containsKey(nume)) {
            return pacientSpitalizare.get(nume);
        }
        else{
            throw new Exception("Nu ex pacientul");
        }
    }
}
