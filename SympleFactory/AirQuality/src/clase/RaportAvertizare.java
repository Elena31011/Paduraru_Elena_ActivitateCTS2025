package clase;

public class RaportAvertizare implements AbstractAirQualityReport {
    public RaportAvertizare() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Aerul prezinta risc de imbolnavire");
    }

}
