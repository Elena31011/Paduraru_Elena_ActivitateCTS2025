package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        AReclamatie usoara = new ReclamatieUsoara();
        AReclamatie medie = new ReclamatieMedie();
        AReclamatie urata = new ReclamatieUrata();

        usoara.setUrmatorul(medie);
        medie.setUrmatorul(urata);

        Client client = new Client("Ana ", "OK");
        Client client1 = new Client("Maria ", "Buna");
        Client client2 = new Client("Anca ", "Urata");

        usoara.recomanda(client);
        usoara.recomanda(client1);
        usoara.recomanda(client2);

    }
}
