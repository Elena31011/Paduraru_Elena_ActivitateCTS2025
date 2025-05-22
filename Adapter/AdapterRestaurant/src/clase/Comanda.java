package clase;

public class Comanda {
    private String nume;

    public Comanda(String nume) {
        this.nume = nume;
    }

    public void comandaTerminata(){
        System.out.println("Comanda " + nume+" a fos terminata si se imprimeaza bonul");
    }
}
