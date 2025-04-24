package main;

import clase.EnumBicicleta;
import clase.FactorySimpleBicicleta;
import clase.IBicicleta;

public class Main {
    public static void main(String[] args) {
        FactorySimpleBicicleta factorySimpleBicicleta = new FactorySimpleBicicleta();
        IBicicleta iBicicleta = factorySimpleBicicleta.getBicicleta(EnumBicicleta.MTB,"sf",20, "Grea",true, false);


    }
}
