package Proxy.main;

import Proxy.clase.IRezervare;
import Proxy.clase.ProxyNumeClient;
import Proxy.clase.Rezervare;
import Proxy.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        IRezervare proxy = new RezervareProxy(rezervare);
        proxy.realizeazaRezervare("Andrei Popescu", 2);
        proxy.realizeazaRezervare("Mihnea Ionescu", 5);

        IRezervare proxyCompus = new ProxyNumeClient(proxy);
        proxyCompus.realizeazaRezervare("Popa Irina", 2);
        proxyCompus.realizeazaRezervare("Popa", 5);
        proxyCompus.realizeazaRezervare("Popa Irina", 5);
    }
}
