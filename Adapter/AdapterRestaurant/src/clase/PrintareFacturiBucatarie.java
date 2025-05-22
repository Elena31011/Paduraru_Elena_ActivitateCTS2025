package clase;

public class PrintareFacturiBucatarie {
    private String comanda;
    private float pret;

    public PrintareFacturiBucatarie(String comanda, float pret) {
        this.comanda = comanda;
        this.pret = pret;
    }

    public String getComanda() {
        return comanda;
    }

    public float getPret() {
        return pret;
    }

    public void printeazaComanda(){
        System.out.println("Comanda "+ comanda+" are pretul de "+pret);
    }
}
