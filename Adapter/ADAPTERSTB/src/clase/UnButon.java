package clase;

public class UnButon implements IButonToateUsile{

    @Override
    public void deschideToateUsile() {
        System.out.println("Toate usile s au deschid liber");
    }

    @Override
    public void deschideFortatToateUsile() {
        System.out.println("Toate usile s au edschis fortat");
    }
}
