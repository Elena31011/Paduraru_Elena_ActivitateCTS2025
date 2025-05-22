package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Emitator emitator = new Emitator("Adrian");
        IDocXML docXML = new DocXML();

        Adapter adapter = new Adapter("Factura");
        emitator.emitereDocument(adapter);


    }
}
