package clase;

public class Facade {
    public void verificareMasa(Masa masa) {
        Ospatar ospatar = new Ospatar();
        Receptionist receptionist = new Receptionist();
        if (masa.getEsteLipera()) {
            if (ospatar.masaEsteAranjata(masa) == true) {
                if (receptionist.masaELibera(masa) == true) {
                    System.out.println("Clientrul poate lua loc la masa");
                }
                else {
                    System.out.println("Masa e aranjata");
                }
            } else {
                System.out.println("Masa nu e libera");
            }

        } else {
            System.out.println("Masa nu e aranjata");
        }
    }
}

