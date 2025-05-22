package clase;

public class ProxyRezervare implements IRezervare{
    private IRezervare rezervare;

    public ProxyRezervare(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(String client, int nrPersoane) {
        if(nrPersoane>3){
            rezervare.realizareRezervare(client, nrPersoane);
        }
        else {
            System.out.println("Veniti la restaurant ca sa vedem daca aveti loc la mese de 2!");
        }
    }
}
