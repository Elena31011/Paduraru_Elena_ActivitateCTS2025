package clase;

public class ReclamatieUsoara extends  AReclamatie{

    @Override
    public void recomanda(Client client ) {
        if(client.getReclamatie().length()==4){
            System.out.println("Reclamatia data de "+client.getNume() + "a fost draguta "+ client.getReclamatie());

        }
        else if (urmatorul!=null){
            urmatorul.recomanda(client);
        }
    }
}
