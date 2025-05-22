package clase;

public class Cash implements ModPlata{
    @Override
    public void plateste(String numeClient, double sumaPlatita) {
        System.out.println(numeClient + " platest cu cash suma de "+ sumaPlatita);
    }
}
