package main;

import clase.AdapterClase;
import clase.IInventarNou;
import clase.Item;
import clase.SoftScanareGestiune;

public class Main {
    public static void main(String[] args) {
        IInventarNou iInventarNou = new SoftScanareGestiune("MASa");
        Item item = new Item("Item nou");
        item.avemUnNouItem();
        iInventarNou.inregistrareItem();
        AdapterClase adapter = new AdapterClase(20);
        adapter.inregistrareItem();
    }
}
