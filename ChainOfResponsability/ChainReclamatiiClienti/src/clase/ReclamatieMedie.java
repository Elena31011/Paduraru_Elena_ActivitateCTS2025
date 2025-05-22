package clase;

public class ReclamatieMedie extends AReclamatie{

    @Override
    public void recomanda(Client client) {
        if(client.getReclamatie().length()==2){
            System.out.println("Reclamatia data de "+client.getNume() + "a fost medie "+ client.getReclamatie());
        }
        else if (urmatorul!=null){
            urmatorul.recomanda(client);
        }
    }
}
