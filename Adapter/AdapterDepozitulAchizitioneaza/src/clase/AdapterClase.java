package clase;

public class AdapterClase extends SoftImprimareTichete implements IInventarNou{
    public AdapterClase(float pret) {
        super(pret);
    }

    @Override
    public void inregistrareItem() {
        super.imprimarePret();
    }
}
