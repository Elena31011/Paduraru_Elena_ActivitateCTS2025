package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends AMeniu{
    private List<AMeniu>itemi;
    private String nume;

    public Sectiune( String nume) {
        this.itemi = new ArrayList<>();
        this.nume = nume;
    }

    @Override
    public void descriereMeniu() {
        System.out.println("Sectiunea"+nume + " are itemi");
        for (AMeniu item:itemi){
            item.descriereMeniu();
        }
    }

    @Override
    public void adaugaNod(AMeniu item) {
        itemi.add(item);
    }

    @Override
    public void stergeNod(AMeniu item) {
        itemi.remove(item);
    }

    @Override
    public AMeniu getNodCopil(int index) {
        return itemi.get(index);
    }
}
