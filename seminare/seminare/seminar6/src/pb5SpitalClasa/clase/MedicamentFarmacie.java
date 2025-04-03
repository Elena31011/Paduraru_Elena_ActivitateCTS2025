package pb5SpitalClasa.clase;

public class MedicamentFarmacie implements IMedicamentFarmacie{
    private float pret;
    private String nume;
    private boolean esteInStoc;

    public MedicamentFarmacie(float pret, String nume, boolean esteInStoc) {
        this.pret = pret;
        this.nume = nume;
        this.esteInStoc = esteInStoc;
    }

    public void cumparaMedicament(){
        if(this.esteInStoc){
            System.out.println("Med "+ this.nume+" a costat "+this.pret+" lei");
        }
        else{
            System.out.println("Med "+this.nume+" nu e in stocul farmaciie");
        }
    }
}
