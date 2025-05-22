package clase;

public class RecomandaJacheta extends ARecomandareImbracaminte{
    @Override
    public void recomanda(int grade) {
        if(grade>0&&grade<=10){
            System.out.println("Se recomanda puratarea unei jachete");
        }
        else if(urmatorul!=null){
            urmatorul.recomanda(grade);
        }
    }
}
