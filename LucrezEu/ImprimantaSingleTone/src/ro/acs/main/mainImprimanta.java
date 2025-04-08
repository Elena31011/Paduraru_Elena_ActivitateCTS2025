package ro.acs.main;

import ro.acs.clase.Imprimanta;

public class mainImprimanta {
    public static void main(String[] args) {
        Imprimanta imprimanta = Imprimanta.getInstane();
        System.out.println(imprimanta);
    }
}
