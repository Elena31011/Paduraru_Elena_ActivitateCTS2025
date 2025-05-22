package main;

import clase.PachetCazare;
import clase.PachetTransport;
import clase.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        PachetTuristic p1 = new PachetCazare(1234);
        PachetTuristic p2 = new PachetTransport(5678);
        p1.cautareCazare(1234);
        p1.cautareCazare(1235);
        p2.cautareCazare(5678);



    }
}
