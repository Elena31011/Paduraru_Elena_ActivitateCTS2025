package clase;


import java.util.ArrayList;
import java.util.List;

public class Composite implements IHaine{

    private String numeColectie;
    private List<IHaine> lista;

    public Composite(String numeColectie) {
        this.numeColectie = numeColectie;
        this.lista = new ArrayList<>();
    }

    @Override
    public void descriere() {
        if(lista!=null) {
            System.out.println("Colectia de " + numeColectie);
            for (IHaine list : lista) {
                list.descriere();
            }
        }
    }

    @Override
    public void adaugaNod(IHaine haine) {
        lista.add(haine);
    }

    @Override
    public void stergeNod(IHaine haine) {

        lista.remove(haine);
    }

    @Override
    public void getNodCopil(int index) {
        lista.get(index);
    }
}
