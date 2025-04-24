package clase;

public class FactoryRaport {
    public  AbstractAirQualityReport getRaport(int value){
        if(value >= 0 && value <= 30){
            return new RaportAerCurat();
        }
        else if(value > 30 && value <= 70){
            return new RaportAvertizare();
        }
        else if(value > 70){
            return new RaportRisc();
        }
        else{
            throw new RuntimeException("Nu ati introdus un numar valid, trebuie sa fie peste 0");
        }
    }
}
