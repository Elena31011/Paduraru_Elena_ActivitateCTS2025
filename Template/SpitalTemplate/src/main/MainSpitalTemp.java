package main;

import clase.Pacient;
import clase.SpitalPrivat;
import clase.SpitalPublic;
import clase.TamplateInternare;

public class MainSpitalTemp {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Ana", 4);

        TamplateInternare internareSpital = new SpitalPublic("Spit municipal");
        internareSpital.internare(pacient);

        TamplateInternare internarePrivat = new SpitalPrivat();
        internarePrivat.internare(pacient);
    }
}
