package main;

import clase.Card;
import clase.Client;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu");

        client.plateste(300);

        client.setModPlata(new Card());
        client.plateste(200);
    }
}
