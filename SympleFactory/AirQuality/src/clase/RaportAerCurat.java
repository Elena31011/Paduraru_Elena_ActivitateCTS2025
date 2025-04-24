package clase;

public class RaportAerCurat implements AbstractAirQualityReport{
    public RaportAerCurat() {
    }

    @Override
    public void generateRaport() {
        System.out.println("Aerul este curat");
    }
}
