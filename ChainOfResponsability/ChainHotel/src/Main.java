public class Main {
    public static void main(String[] args) {
        Client client = new Client("ANA", "1234","12@DW");
        Client client1 = new Client("ANA", "2u7ri",null);
        Client client2 = new Client("ANA", null,null);

        Handler email = new NotificaEmail();
        Handler sms = new NotificaSMS();
        Handler manager = new NotificaManager();

        email.setUrmatorul(sms);
        sms.setUrmatorul(manager);

        email.recomanda(client);
        email.recomanda(client1);
        email.recomanda(client2);
    }
}
