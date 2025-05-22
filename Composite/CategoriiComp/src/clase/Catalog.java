package clase;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements IStructura{
    private String nume;
    private List<IStructura> list;

    public Catalog(String nume) {
        this.nume = nume;
        this.list = new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Catalogul "+ nume + " are urmatoarele cataloage sau iteme: ");
        for(IStructura structura: list){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura iStructura) {

    }

    @Override
    public void stergeNod(IStructura iStructura) {

    }

    @Override
    public IStructura getCopilNod(int index) {
        return null;
    }
}
