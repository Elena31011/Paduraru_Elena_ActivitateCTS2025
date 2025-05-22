package clase;

public class MasaDeBogati extends AOcupareMasa{
    @Override
    public void curataMasa() {
        System.out.println("Masa s-a sters cu solutii speciale");
    }

    @Override
    public void seAseazaServetele() {
        System.out.println("S-au pus servetelele in forma de inimioara");
    }

    @Override
    public void seAseazaTacamuri() {
        System.out.println("S-au asezat tacamurile de argint in servetel");
    }

    @Override
    public void suntinvitatePersLaMasa() {
        System.out.println("Va rugam luati un loc, cina va fi servita imediat!");
    }
}
