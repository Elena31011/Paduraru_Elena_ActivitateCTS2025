package main;

import clase.INota;
import clase.NotaAnNou;
import clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        INota nota = new NotaDePlata(200);
        INota notaDecorataAnNou = new NotaAnNou(nota);

        INota notaDePaste = new NotaAnNou(nota);
        notaDePaste.printareNota();
        notaDecorataAnNou.printareNota();

    }
}
