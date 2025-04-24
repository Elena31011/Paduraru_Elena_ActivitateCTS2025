package main;

import clase.Publication;
import clase.PublicationBuilder;

public class Main {
    public static void main(String[] args) {
        Publication publication = new PublicationBuilder().setPrice(100).build();
        System.out.println(publication);
    }
}
