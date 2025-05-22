package clase;

public class Client {
    private String Nume;
    private AbstractCreditConditions creditConditions;

    public Client(String nume, AbstractCreditConditions creditConditions) {
        Nume = nume;
        this.creditConditions = creditConditions;
    }

    public Client(String nume) {
        Nume = nume;
    }

    public void returneazaAnticipat(){

    }
}
