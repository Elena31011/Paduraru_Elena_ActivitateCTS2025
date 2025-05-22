package clase;

public class AdapterClase extends SaseButoane implements IButonToateUsile{

    @Override
    public void deschideToateUsile() {
        super.butonfata();
        super.butonmijloc();
        super.butonspate();
    }

    @Override
    public void deschideFortatToateUsile() {
        super.butonFortatfata();
        super.butonFortamijloc();
        super.butonFortatspate();
    }
}
