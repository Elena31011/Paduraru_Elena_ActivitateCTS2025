package clase;

public class AdapterClase extends PrintareFacturiBucatarie implements IFacturaBar{
    public AdapterClase(String comanda, float pret) {
        super(comanda, pret);
    }

    @Override
    public void imprimare() {
        super.printeazaComanda();
    }
}
