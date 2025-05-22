package main;

import clase.AMeniu;
import clase.Item;
import clase.Sectiune;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item("cola");
        Item i2 = new Item("pepsi");
        Item i3 = new Item("fanta");


        AMeniu meniuBauturi = new Sectiune(" Bauturi");
        meniuBauturi.adaugaNod(i1);
        meniuBauturi.adaugaNod(i2);
        meniuBauturi.adaugaNod(i3);

        meniuBauturi.descriereMeniu();

        meniuBauturi.stergeNod(i1);
        System.out.println("Meniu.2");
        meniuBauturi.descriereMeniu();

        System.out.println("-------");
        meniuBauturi.getNodCopil(0).descriereMeniu();
    }
}
