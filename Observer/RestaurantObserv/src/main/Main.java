package main;

import clase.ClientFidel;
import clase.Observator;
import clase.Restaurant;
import clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Chinez");

        ClientFidel clientFidel = new ClientFidel("Ana");

        restaurant.adaugaObservator(clientFidel);
        restaurant.trimiteOferta();
        restaurant.meniuNou();
    }
}
