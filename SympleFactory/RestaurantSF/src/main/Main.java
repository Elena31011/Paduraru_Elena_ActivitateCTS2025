package main;

import clase.EnumSupa;
import clase.FactorySupa;
import clase.ISupe;

public class Main {
    public static void main(String[] args) {
        FactorySupa factorySupa = new FactorySupa();
        ISupe supe = factorySupa.getSupe(EnumSupa.SUPACIUPERCI, "ciup", 2);
        System.out.println(supe);
    }
}
