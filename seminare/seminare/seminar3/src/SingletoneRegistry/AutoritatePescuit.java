package SingletoneRegistry;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class AutoritatePescuit {
    private String denumire;
    private String website;
    private int nrAngajati;

    private static AutoritatePescuit instance;

    private AutoritatePescuit(String denumire, String website, int nrAngajati) {
        this.denumire = denumire;
        this.website = website;
        this.nrAngajati = nrAngajati;
    }

    public static AutoritatePescuit getInstance(){
        if(instance==null){
            instance=new AutoritatePescuit("Autorizatie", "aut.web.ro", 10);
        }
        return instance;
    }

    private Map<String, Autorizatie> registry = new HashMap<>();

    public Autorizatie emiteAutorizatie(String numePersoana){
        if(!registry.containsKey(numePersoana)){
            registry.put(numePersoana, new Autorizatie(numePersoana, new Date().toString(), registry.size()+1));
        }
            return registry.get(numePersoana);
    }

}
