package clase;

public class RecomandareGeaca extends ARecomandareImbracaminte{
    @Override
    public void recomanda(int grade) {
        if(grade<=0){
            System.out.println("Se recomanda sa va imbracati cu o geaca groasa");
        }
        else if(urmatorul!=null) {
            urmatorul.recomanda(grade);
        }
    }
}
