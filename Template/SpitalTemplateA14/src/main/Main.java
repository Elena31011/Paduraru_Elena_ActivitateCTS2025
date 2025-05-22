package main;

import clase.AInternare;
import clase.InternareUrgente;
import clase.InternareUsoara;
import clase.Pacient;

public class Main {
    public static void main(String[] args) {
        AInternare iUsoara = new InternareUsoara();
        AInternare iUrgente = new InternareUrgente();

        Pacient pacient = new Pacient("Ana", 5);
        iUsoara.internare(pacient);
        System.out.println("-------");
        iUrgente.internare(pacient);

    }
}
