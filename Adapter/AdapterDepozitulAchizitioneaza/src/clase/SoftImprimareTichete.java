package clase;

public class SoftImprimareTichete {
    private float pret;

    public SoftImprimareTichete(float pret) {
        this.pret = pret;
    }

    public float getPret() {
        return pret;
    }

    public void imprimarePret(){
        System.out.println("S a imprimat pretul in valoare de" + pret);
    }
}
