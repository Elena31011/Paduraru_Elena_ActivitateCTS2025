package main;

import clase.ComponentaFactory;
import clase.EnumComponente;
import clase.IComponenta;
import clase.Usa;

public class Main {
    public static void main(String[] args) {
        ComponentaFactory factory = new ComponentaFactory();
        IComponenta tipComp = factory.getComponenta(EnumComponente.USA, "roz", "Metal", true);
        System.out.println(tipComp);
    }
}
