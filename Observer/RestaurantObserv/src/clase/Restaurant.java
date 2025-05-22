package clase;

import java.util.ArrayList;
import java.util.List;

public class  Restaurant implements Subiect{
    private String nume;
    private List<Observator>observatori;

    public Restaurant(String nume) {
        this.nume = nume;
        this.observatori = new ArrayList<>();
    }


    @Override
    public void adaugaObservator(Observator observator) {
        observatori.add(observator);
    }

    @Override
    public void stergeObservator(Observator observator) {
        observatori.add(observator);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observator client: observatori){
            client.primesteMesaj(mesaj);
        }
    }

    public void trimiteOferta(){
        trimiteMesaj("ca restaurantul "+this.nume+" are o oferta");
    }

   public void meniuNou(){
        trimiteMesaj("ca restaurantul "+ this.nume+ " are un meniu nou");

    }
}
