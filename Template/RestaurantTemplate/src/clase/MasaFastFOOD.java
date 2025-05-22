package clase;

public class MasaFastFOOD extends AOcupareMasa{
    @Override
    public void curataMasa() {
        System.out.println("Masa s-a sters cu servetele umede");
    }

    @Override
    public void seAseazaServetele() {
        System.out.println("S-au pus servetele albe");
    }

    @Override
    public void seAseazaTacamuri() {
        System.out.println("S-au pus tacamurile de plastic");
    }

    @Override
    public void suntinvitatePersLaMasa() {
        System.out.println("V-a rog sa va luati comanda si mergeti la masa!");
    }
}
