package ro.acs.main;

import ro.acs.clase.DocumentText;
import ro.acs.clase.IDocument;
import ro.acs.clase.ImprimataEager;

public class main {
    public static void main(String[] args) {
        IDocument doc =new DocumentText("Contract munca", 5, false);

        ImprimataEager imprimataEager = ImprimataEager  .getInstance();
        imprimataEager.printeaza(doc);
    }
}

