package clase;

public class Senzor implements AbstractAirQualitySenzor{
   private int pm10;
   private int temperatura;
   private int umiditate;
   private int pm25;

    protected Senzor(int pm10, int temperatura, int umiditate, int pm25) {
        this.pm10 = pm10;
        this.temperatura = temperatura;
        this.umiditate = umiditate;
        this.pm25 = pm25;
    }

    @Override
    public int getPM10() {
        return 0;
    }

    @Override
    public int getTemperatura() {
        return 0;
    }

    @Override
    public int getUmiditate() {
        return 0;
    }

    @Override
    public int getPM25() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Senzor{");
        sb.append("pm10=").append(pm10);
        sb.append(", temperatura=").append(temperatura);
        sb.append(", umiditate=").append(umiditate);
        sb.append(", pm25=").append(pm25);
        sb.append('}');
        return sb.toString();
    }
}
