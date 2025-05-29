package Decorator.main;

import Decorator.clase.Nota;
import Decorator.clase.NotaAnNou;
import Decorator.clase.NotaCraciun;
import Decorator.clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(145.5f);
        Nota notaDecorata = new NotaAnNou(nota);

        Nota notaCraciun = new NotaCraciun(notaDecorata);
        notaCraciun.printare();
    }
}
