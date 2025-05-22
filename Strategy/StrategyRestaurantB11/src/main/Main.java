package main;

import clase.Card;
import clase.Cash;
import clase.Client;
import clase.IModPlata;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ana");
        Client client1 = new Client("ama");

        IModPlata modPlataCash = new Cash();
        IModPlata modPlataCard = new Card();

        client.setModPlata(modPlataCard);
        client1.setModPlata(modPlataCash);

        client.plateste(20);
        client1.plateste(34.4);
    }
}
