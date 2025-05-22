package clase;

public class RecomandaEmail extends ARestaurant{

    @Override
    public void recomanda(Client client) {
        if(client.isAreEmail()==true){
            System.out.println("Am dat clientului un email");
        } else if (urmatorul != null) {
                urmatorul.recomanda(client);
        }
    }
}
