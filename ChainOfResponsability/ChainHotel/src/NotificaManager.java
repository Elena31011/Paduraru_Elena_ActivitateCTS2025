public class NotificaManager extends Handler{
    @Override
    public void recomanda(Client client) {

            System.out.println("Se va trimite un mesaj Managerului despre clientul cu numele" + client.getNume());
    }
}
