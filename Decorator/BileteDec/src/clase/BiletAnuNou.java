package clase;

public class BiletAnuNou extends ImprimareDecorator{

    public BiletAnuNou(Bilet bilet) {
        super(bilet);
    }

    @Override
    public void imprimareMesaj() {
        System.out.println("La multi ani!");
    }
}
