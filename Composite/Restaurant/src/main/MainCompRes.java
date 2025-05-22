package main;

import clase.IStructura;
import clase.Item;
import clase.Sectiune;

import java.util.ArrayList;
import java.util.List;

public class MainCompRes {
    public static void main(String[] args) {
        IStructura sectiune = new Sectiune("Meniu");
        IStructura starter = new Sectiune("Starter");
        IStructura bauturi = new Sectiune("Bauturi");
        IStructura desert = new Sectiune("Desert");

        Item salam = new Item("Salam");
        Item apa = new Item("Apa");
        Item cafea = new Item("Cafea");
        Item suc = new Item("Suc");
        Item clatite = new Item("Clatite");

        sectiune.adaugaNod(starter);
        sectiune.adaugaNod(bauturi);
        sectiune.adaugaNod(desert);

        starter.adaugaNod(salam);
        bauturi.adaugaNod(apa);
        bauturi.adaugaNod(cafea);
        bauturi.adaugaNod(suc);
        desert.adaugaNod(clatite);

        sectiune.descriereStructura();

        System.out.println(sectiune.getCopilNod(2));
    }
}
