package main;

import clase.Client;
import clase.IClient;
import clase.ReceptyeFly;
import clase.Rezervare;

public class Main {

    public static void main(String[] args){
        Rezervare rezervare = new Rezervare(2);

        ReceptyeFly receptyeFly = new ReceptyeFly();
        try {
            receptyeFly.getIClient("Ana", "23@we");
            receptyeFly.getIClient("Ana").afiseazaInformatii(rezervare);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
