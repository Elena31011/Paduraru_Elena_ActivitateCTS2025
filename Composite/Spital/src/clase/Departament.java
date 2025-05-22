package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura{
    private String nume;
    private List<IStructura> list;

    public Departament(String nume) {
        this.nume = nume;
        this.list = new ArrayList<>();
    }

    @Override
    public void descriereStructura() {
        System.out.println("Spitalul "+ nume+" are sectiunile ");
        for(IStructura structura :list ){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura iStructura) {
        list.add(iStructura);
    }

    @Override
    public void stergeNod(IStructura iStructura) {
        list.remove(iStructura);
    }

    @Override
    public IStructura getCopilNod(int index) {
        return list.get(index);
    }
}
