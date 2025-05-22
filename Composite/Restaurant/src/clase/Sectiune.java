package clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements IStructura {
    private String nume;
    private List<IStructura> lista;

    public Sectiune(String nume) {
        this.nume = nume;
        this.lista = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<IStructura> getLista() {
        return lista;
    }

    public void setLista(List<IStructura> lista) {
        this.lista = lista;
    }

    @Override
    public void descriereStructura() {
        System.out.println("Sectiunea "+ nume+ " are urm subsectiuni sau itemuri");
        for(IStructura structura: lista){
            structura.descriereStructura();
        }
    }

    @Override
    public void adaugaNod(IStructura iStructura) {
        lista.add(iStructura);
    }

    @Override
    public void stergeNod(IStructura iStructura) {
        lista.remove(iStructura);
    }

    @Override
    public IStructura getCopilNod(int index) {
        return lista.get(index);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sectiune{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", lista=").append(lista);
        sb.append('}');
        return sb.toString();
    }
}
