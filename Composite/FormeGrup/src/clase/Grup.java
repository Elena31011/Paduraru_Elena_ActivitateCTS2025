package clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements IStructura{
    private String nume;
    private List<IStructura> list;

    public Grup(String nume) {
        this.nume = nume;
        this.list = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getList() {
        return list;
    }

    public void setList(List<IStructura> list) {
        this.list = list;
    }

    @Override
    public void descriereStruct() {
        System.out.println("Grupul "+nume+ " are formele sau grupurile: ");
        for(IStructura structura: list){
            structura.descriereStruct();
        }
    }

    @Override
    public void adaugaNod(IStructura iStructura) {
        list.add(iStructura);
    }

    @Override
    public void stergereNod(IStructura iStructura) {
        list.remove(iStructura);
    }

    @Override
    public IStructura getCopilNod(int index) {
        return list.get(index);
    }
}
