package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport implements Subiect{
    private int linie;
    private List<Observator> calatori;

    public MijlocTransport(int linie) {
        this.linie = linie;
        this.calatori = new ArrayList<>();
    }

    public int getLinie() {
        return linie;
    }

    public List<Observator> getCalatori() {
        return calatori;
    }

    @Override
    public void adaugaObservator(Observator observator) {
        this.calatori.add(observator);
    }

    @Override
    public void stergeObservator(Observator observator) {
        this.calatori.remove(observator);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observator calator : calatori){
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapatLinie();
}
