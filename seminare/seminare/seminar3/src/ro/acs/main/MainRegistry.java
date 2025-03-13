package ro.acs.main;

import SingletoneRegistry.AutoritatePescuit;
import SingletoneRegistry.Autorizatie;

public class MainRegistry {
    public static void main(String[] args) {
        AutoritatePescuit autoritate = AutoritatePescuit.getInstance();

        Autorizatie autoritateGeorgeCosbuc=autoritate.emiteAutorizatie("George Cosbuc");
        System.out.println(autoritateGeorgeCosbuc.toString());
        Autorizatie autoritateGeorgeCosbuc2=autoritate.emiteAutorizatie("George Cosbuc");
        System.out.println(autoritateGeorgeCosbuc.toString());

    }
}
