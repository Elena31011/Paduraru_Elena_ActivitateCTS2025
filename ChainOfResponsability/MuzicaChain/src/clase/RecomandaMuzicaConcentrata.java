package clase;

public class RecomandaMuzicaConcentrata extends ARecomandaMuzica{
    @Override
    public void recomanda(int ora) {
        if(ora>12.00 && ora<=18.00){
            System.out.println("Se recomanda muzica interactiva");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(ora);
        }
    }
}
