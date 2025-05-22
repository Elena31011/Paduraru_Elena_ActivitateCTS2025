package main;

import clase.IPacientAbstract;
import clase.Pacient;
import clase.ReceptieFactory;
import clase.Spitalizare;

public class MainSpitFly {
    public static void main(String[] args) {
        ReceptieFactory receptieFactory = new ReceptieFactory();

        receptieFactory.getPacient("ama", "123", "aaaa");
        receptieFactory.getPacient("ana", "456", "bbbb");
        receptieFactory.getPacient("ala", "789", "cccc");

        Spitalizare s1 = new Spitalizare(1, 3, 1);
        Spitalizare s2 = new Spitalizare(2, 3, 2);
        Spitalizare s3 = new Spitalizare(3, 3, 7);

        try {
            receptieFactory.getPacient("ama").afiseazaInformatii(s1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
