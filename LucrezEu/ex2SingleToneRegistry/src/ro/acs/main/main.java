package ro.acs.main;

import ro.acs.clase.MeteoService;
import ro.acs.clase.RegistrySingleTone;

public class main {
    public static void main(String[] args) {
        RegistrySingleTone registrySingleTone = new RegistrySingleTone();
        MeteoService meteoService = (MeteoService) new RegistrySingleTone().getInstance(RegistrySingleTone.meteoService);
        System.out.println(meteoService);
        MeteoService meteoService1 = (MeteoService) new RegistrySingleTone().getInstance(RegistrySingleTone.meteoService);
        System.out.println(meteoService==meteoService1);
    }
}
