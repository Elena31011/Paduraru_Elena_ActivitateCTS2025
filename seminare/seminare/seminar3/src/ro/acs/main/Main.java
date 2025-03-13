package ro.acs.main;


import ro.acs.clase.AutoritatePescuitEager;
import ro.acs.clase.AutoritatePescuitLazy;

public class Main {
    public static void main(String[] args) {
        AutoritatePescuitEager autoritatePescuitEager = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager.concediaza(2);
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.setDenumire("ANpPA");
        autoritatePescuitEager.setWebSite("ANpPA.ro");
        System.out.println(autoritatePescuitEager.toString());
        autoritatePescuitEager.emiteAutorizatie("Popescu Paul");
        System.out.println(autoritatePescuitEager.toString());
        AutoritatePescuitEager autoritatePescuitEager1 = AutoritatePescuitEager.getInstance();
        autoritatePescuitEager1.emiteAutorizatie("Popescu Mihai");
        System.out.println(autoritatePescuitEager.toString());

        System.out.println("--------------------------------------------------");

        AutoritatePescuitLazy lazyInstance = AutoritatePescuitLazy.getInstance("ANPA", "anpa.ro", 10, 150);
        System.out.println(lazyInstance);
        AutoritatePescuitLazy lazyInstance2 =AutoritatePescuitLazy.getInstance("Paul", "paul.ro", 10, 150);
        System.out.println(lazyInstance2);
        lazyInstance2.emiteAutorizatie("Ionescu Marcel");
        System.out.println(lazyInstance);

        System.out.println("--------------------------------------------------");

    }
}