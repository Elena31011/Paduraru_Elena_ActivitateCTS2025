package clase;

public class RecomandaTramvai extends AbstractRecomandareTransport{
    @Override
    public void recomanda(float distanta) {
        if(distanta>5&&distanta<=10){
            System.out.println("Se recomanda sa iei tramvaiul");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(distanta);
        }
    }
}
