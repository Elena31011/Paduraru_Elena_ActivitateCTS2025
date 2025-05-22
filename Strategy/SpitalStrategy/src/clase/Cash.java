package clase;

public class Cash implements IMetodaPlata {


    @Override
    public void plateste(float pret) {
        System.out.println("Ai platit cu cash suma de "+pret);
    }
}
