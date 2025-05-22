package clase;

public class ProxyNumeClient implements IRezervare{
    private IRezervare rezervare;

    public ProxyNumeClient(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizareRezervare(String client, int nrPersoane) {
        if(client.length()>=3){
            this.rezervare.realizareRezervare(client, nrPersoane);
        }
        else {
            System.out.println("Nu va este permisa rezervarea");
        }
    }
}
