package clase;

public class Card implements IModPlata{

    @Override
    public void plateste(double sumaPlatita) {
        System.out.println(" platest cu card suma de "+ sumaPlatita);
    }
}
