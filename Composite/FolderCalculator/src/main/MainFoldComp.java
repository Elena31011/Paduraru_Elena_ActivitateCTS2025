package main;

import clase.Fisier;
import clase.Folder;
import clase.ISectiune;

public class MainFoldComp {
    public static void main(String[] args) {
        ISectiune folder = new Folder("Local D");

        ISectiune poze = new Folder("Poze");
        ISectiune documente = new Folder("Documente");

        Fisier imagine1 = new Fisier("imagine1");
        Fisier imagine2 = new Fisier("imagine2");
        Fisier certificat = new Fisier("certificat");

        folder.adaugaNod(poze);
        folder.adaugaNod(documente);

        poze.adaugaNod(imagine1);
        poze.adaugaNod(imagine2);
        documente.adaugaNod(certificat);

        folder.descriereSectiune();

    }
}
