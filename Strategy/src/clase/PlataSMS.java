package clase;

public class PlataSMS implements IMetodaPlata{
    @Override
    public void plateste(float pretBilet) {
        System.out.println("Pretul biletului este "+ pretBilet + " si a fost validata");
    }
}
