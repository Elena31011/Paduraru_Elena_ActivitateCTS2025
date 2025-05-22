package main;

import clase.Composite;
import clase.IHaine;
import clase.Item;

public class psvm {
    public static void main(String[] args) {
        IHaine colectieVara = new Composite("vara");
        IHaine it1 = new Item("rochie");
        IHaine it2 = new Item("tricou");

        //colectieVara.adaugaNod(it1);
        //colectieVara.adaugaNod(it2);

        colectieVara.descriere();
    }
}
