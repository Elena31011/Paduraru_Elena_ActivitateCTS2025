package clase;

public class PrintareFacturiBar implements IFacturaBar{
    private String bautura;
    private float pretBautura;

    public PrintareFacturiBar(String bautura, float pretBautura) {
        this.bautura = bautura;
        this.pretBautura = pretBautura;
    }

    public String getBautura() {
        return bautura;
    }

    public float getPretBautura() {
        return pretBautura;
    }

    @Override
    public void imprimare() {
        System.out.println("Bautura "+bautura+" costa "+ pretBautura);
    }


}
