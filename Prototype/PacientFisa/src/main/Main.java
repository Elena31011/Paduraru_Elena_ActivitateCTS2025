package main;

import clase.FisaPacient;
import clase.Pacient;
import clase.ProtoypeFisaPacient;

public class Main {
    public static void main(String[] args) {
        Pacient p1= new Pacient("Ana", 20, "au");
        FisaPacient fisaPacient = ProtoypeFisaPacient.getFP(p1.getAfectiunePrincipala());
        System.out.println(fisaPacient);
    }


}
