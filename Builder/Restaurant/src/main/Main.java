package main;

import clase.BuilderRestaurant;
import clase.Restaurant;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new BuilderRestaurant().setLageam(true).build();
        System.out.println(restaurant);
    }
}
