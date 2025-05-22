package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        ARestaurant recomandaSMS = new RecomandaSMS();
        ARestaurant recomandaEmail = new RecomandaEmail();
        ARestaurant recomandaMesManager = new RecomandaMesManager();

        Client c1 = new Client(true, true, "Ana");
        Client c2 = new Client(false, true, "Ana");
        Client c3 = new Client(false, false, "Ana");

        recomandaSMS.setUrmatorul(recomandaEmail);
        recomandaEmail.setUrmatorul(recomandaMesManager);

        recomandaSMS.recomanda(c1);
        recomandaSMS.recomanda(c2);
        recomandaSMS.recomanda(c3);
    }
}
