package clase;

public class RecomandaMesManager extends ARestaurant{
    @Override
    public void recomanda(Client client) {
        if(client.getNume().length() > 2){
            System.out.println("Am trimis Managerului mesajul spre clientul "+ client.getNume());
        }
    }
}
