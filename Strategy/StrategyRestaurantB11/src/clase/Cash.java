package clase;

public class Cash implements IModPlata{

    @Override
    public void plateste(double sumaPlatita) {
        System.out.println("platest cu cash suma de "+ sumaPlatita);
    }
}
