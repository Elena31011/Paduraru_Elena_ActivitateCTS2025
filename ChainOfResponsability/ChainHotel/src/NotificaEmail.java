public class NotificaEmail extends Handler{
    @Override
    public void recomanda(Client client) {
        if(client.getEmail()!=null){
            System.out.println("Se va trimite un email la clientul cu numele" + client.getNume());
        }
        else {
            getUrmatorul().recomanda(client);
        }
    }
}
