package main;

import clase.Bilet;
import clase.BiletAnuNou;
import clase.ImprimareBilet;
import clase.ImprimareDecorator;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new ImprimareBilet();
        bilet.imprimare();

        ImprimareDecorator biletAnNou = new BiletAnuNou(bilet);
        biletAnNou.imprimareMesaj();
    }
}
