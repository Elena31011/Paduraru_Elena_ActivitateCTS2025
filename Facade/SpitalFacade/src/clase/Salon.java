package clase;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Pat>paturi;

    public Salon() {
        this.paturi = new ArrayList<>();
    }

    public void adaugaPaturi(Pat pat){
        paturi.add(pat);
    }

    public boolean eLiberPatul(){
        for(Pat pat:paturi){
            if(pat.isEsteLiber()){
                return true;
            }
        }
        return false;
    }
}
