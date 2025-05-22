package main;

import clase.Agentie;
import clase.ClientFidel;
import clase.Observator;
import clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Observator client1 = new ClientFidel(" Andrei");

        Agentie agentieTurism = new Agentie("de la agentia de Turism:");

        agentieTurism.adaugaObservator(client1);
        agentieTurism.notifOfertaNoua();
        agentieTurism.notifReducerePret();
    }
}
