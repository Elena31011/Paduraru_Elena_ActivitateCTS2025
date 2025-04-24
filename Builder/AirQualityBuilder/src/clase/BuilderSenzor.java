package clase;

public class BuilderSenzor {
    private int pm10;
    private int temperatura;
    private int umiditate;
    private int pm25;

    public BuilderSenzor() {
    }

    public BuilderSenzor setPm10(int pm10) {
        this.pm10 = pm10;
        return this;
    }

    public BuilderSenzor setTemperatura(int temperatura) {
        this.temperatura = temperatura;
        return this;
    }

    public BuilderSenzor setUmiditate(int umiditate) {
        this.umiditate = umiditate;
        return this;
    }

    public BuilderSenzor setPm25(int pm25) {
        this.pm25 = pm25;
        return this;
    }

    public Senzor build(){
        return new Senzor( pm10,  temperatura,  umiditate,  pm25);
    }
}
