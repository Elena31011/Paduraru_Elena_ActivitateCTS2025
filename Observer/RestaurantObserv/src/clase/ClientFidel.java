package clase;

public class ClientFidel implements Observator{
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Clientul "+ this.numeClient+" a primit mesajul "+ mesaj);
    }
}
