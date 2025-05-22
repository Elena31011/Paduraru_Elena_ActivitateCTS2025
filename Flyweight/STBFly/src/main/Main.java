package main;

import clase.AutogaraFly;
import clase.Traseu;

public class Main {
    public static void main(String[] args) {
        AutogaraFly autogara = new AutogaraFly();

        autogara.getAutobuz("ama123", "dacia", 1908, 10);
        autogara.getAutobuz("mara123", "ford", 1989, 19);

        Traseu t1 = new Traseu(1, "prima1", "ulima10");
        Traseu t2 = new Traseu(2, "prima", "ulima");

        try{
            autogara.getAutobuz("ama123").afiseazaInformatii(t1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
