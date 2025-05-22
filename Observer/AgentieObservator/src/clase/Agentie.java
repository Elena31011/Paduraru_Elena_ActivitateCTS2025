package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subiect{
    private String numeAgentie;
    private List<Observator> observatori;

    public Agentie(String numeAgentie ) {
        this.numeAgentie = numeAgentie;
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
    public void trimiteMesaj(String mesaj) {
        for(Observator client: observatori){
            client.primesteMesaj(numeAgentie+" "+mesaj);
        }
    }

    public void notifOfertaNoua(){
        trimiteMesaj("Ai o oferta noua");
    }

    public void notifReducerePret(){
        trimiteMesaj("Ai o reducere");
    }
}
