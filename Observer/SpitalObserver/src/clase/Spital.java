package clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subiect{
   private String nume;
   private List<Observator> observatori;

    public Spital(String nume) {
        this.nume = nume;
        this.observatori = new ArrayList<>();
    }

    @Override
    public void adaugaObservator(Observator observator) {
        observatori.add(observator);
    }

    @Override
    public void stergeObservator(Observator observator) {
        observatori.remove(observator);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        System.out.println(mesaj);
        for(Observator obs : observatori){
            obs.primesteNotificare();
        }
    }
}
