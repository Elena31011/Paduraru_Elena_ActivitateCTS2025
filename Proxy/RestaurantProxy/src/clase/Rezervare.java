package clase;

public class Rezervare implements IRezervare {

    @Override
    public void realizareRezervare(String client, int nrPersoane) {
        System.out.println("Rezervarea pentru "+ client + "a rezervat o masa pentru " + nrPersoane +" persoane" );
    }
}
