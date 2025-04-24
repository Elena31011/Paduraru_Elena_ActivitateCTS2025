package main;

import clase.BuilderImagine;
import clase.Imagine;

public class Main {
    public static void main(String[] args) {
        Imagine imagine = new BuilderImagine().setDimensiune(20).build();
        System.out.println(imagine);
    }
}
