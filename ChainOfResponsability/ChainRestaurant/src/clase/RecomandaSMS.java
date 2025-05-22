package clase;

public class RecomandaSMS extends ARestaurant{
    @Override
    public void recomanda(Client client) {
        if(client.isAreNrTel()){
            System.out.println("Am trimis un SMS");
        }
        else if(urmatorul!=null) {
           urmatorul.recomanda(client);
        }
    }
}
