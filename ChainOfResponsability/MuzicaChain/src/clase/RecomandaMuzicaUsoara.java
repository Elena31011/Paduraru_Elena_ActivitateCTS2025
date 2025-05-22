package clase;

public class RecomandaMuzicaUsoara extends ARecomandaMuzica{

    @Override
    public void recomanda(int ora) {
        if(ora>18.00 && ora<= 22.00){
            System.out.println("E rec sa asc muz usoara");
        }
    }
}
