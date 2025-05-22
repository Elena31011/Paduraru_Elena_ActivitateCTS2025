package clase;

public class RecomandaHanorac extends ARecomandareImbracaminte{
    @Override
    public void recomanda(int grade) {
        if(grade>10){
            System.out.println("Se recomanda sa te imbraci cu un hanorac");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(grade);
        }
    }
}
