package clase;

public class RaportRisc implements AbstractAirQualityReport{
    public RaportRisc() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Aerul incepe sa prezinte un risc");
    }
}
