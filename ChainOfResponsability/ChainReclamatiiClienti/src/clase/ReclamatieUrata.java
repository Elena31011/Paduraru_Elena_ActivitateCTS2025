package clase;

public class ReclamatieUrata extends AReclamatie{
    @Override
    public void recomanda(Client client) {
        if(client.getReclamatie().length()==5){

            System.out.println("Reclamatia data de "+client.getNume() + "a fost urata "+ client.getReclamatie());

        }
    }
}

