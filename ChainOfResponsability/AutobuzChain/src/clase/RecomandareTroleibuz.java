package clase;

public class RecomandareTroleibuz extends AbstractRecomandareTransport{

    @Override
    public void recomanda(float distanta) {
        if(distanta<0){
            System.out.println("Nu ai o distanta potrivita");
            return;
        }
        if(distanta<=3){
            System.out.println("Este recomandat sa iei troleibuz");
        }
        else if(urmatorul!=null) {
            urmatorul.recomanda(distanta);
        }
    }
}
