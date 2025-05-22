package clase;

import java.util.ArrayList;
import java.util.List;

public class Manager implements ISectiune {
    private String nume;
    private List<ISectiune> list;

    public Manager(String nume) {
        this.nume = nume;
        this.list = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<ISectiune> getList() {
        return list;
    }

    public void setList(List<ISectiune> list) {
        this.list = list;
    }

    @Override
    public void descriereSectiune() {
        System.out.println("Managerul "+ nume+" are in subordine ");
        for(ISectiune sectiune : list){
            sectiune.descriereSectiune();
        }
    }

    @Override
    public void adaugaNod(ISectiune iSectiune) {
        list.add(iSectiune);
    }

    @Override
    public void stergereNod(ISectiune iSectiune) {
        list.remove(iSectiune);
    }

    @Override
    public ISectiune getCopilNod(int index) {
        return list.get(index);
    }
}
