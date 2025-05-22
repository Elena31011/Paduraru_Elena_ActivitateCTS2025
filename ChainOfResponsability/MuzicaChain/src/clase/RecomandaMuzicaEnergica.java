package clase;

public class RecomandaMuzicaEnergica extends ARecomandaMuzica{
    @Override
    public void recomanda(int ora) {
        if(ora>22.00){
            System.out.println("Ar trebui sa dormi");
            return;
        }
        if(ora>6.00 && ora<=12.00){
            System.out.println("Se recomanda muzica energica");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(ora);
        }
    }
}
