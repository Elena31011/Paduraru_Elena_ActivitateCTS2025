package clase;

public class RecomandaAutobuz extends AbstractRecomandareTransport{

    @Override
    public void recomanda(float distanta) {
        if(distanta>3&& distanta<=5){
            System.out.println("Se recomanda sa iei autobuzul");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(distanta);
        }
    }
}
