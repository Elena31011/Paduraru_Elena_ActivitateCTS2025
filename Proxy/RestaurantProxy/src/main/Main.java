package main;

import clase.IRezervare;
import clase.ProxyNumeClient;
import clase.ProxyRezervare;
import clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare();
        IRezervare rez1 = new ProxyRezervare(rezervare);
        rez1.realizareRezervare("Ana", 2);

        Rezervare rezervare1 = new Rezervare();
        IRezervare rez2 = new ProxyNumeClient(rezervare1);
        rez2.realizareRezervare("Mi", 6);
    }
}
