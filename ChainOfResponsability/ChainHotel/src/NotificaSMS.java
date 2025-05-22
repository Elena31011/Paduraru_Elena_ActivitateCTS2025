public class NotificaSMS extends Handler{


    @Override
    public void recomanda(Client client) {
        if(client.getNrTel()!= null) {
            System.out.println("Se va trimite un SMS la clientul cu numele" + client.getNume());
        }
        else {
            getUrmatorul().recomanda(client);
        }
    }
}
