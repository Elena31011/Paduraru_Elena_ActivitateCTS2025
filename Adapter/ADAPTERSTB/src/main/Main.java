package main;

import clase.Autobuz;
import clase.IButonToateUsile;
import clase.SaseButoane;
import clase.UnButon;

public class Main {
    public static void main(String[] args) {
        IButonToateUsile butonToateUsile = new UnButon();
        Autobuz autobuz = new Autobuz("Ford");
        SaseButoane buton6 = new SaseButoane();
        buton6.butonFortamijloc();
        autobuz.DeschidereUsi();
        butonToateUsile.deschideFortatToateUsile();
    }
}
