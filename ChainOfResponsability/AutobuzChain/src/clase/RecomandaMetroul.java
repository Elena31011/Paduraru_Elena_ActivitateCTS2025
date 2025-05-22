package clase;

public class RecomandaMetroul extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if(distanta>=10){
            System.out.println("Se recomanda sa iei metrou");
        }
    }
}
