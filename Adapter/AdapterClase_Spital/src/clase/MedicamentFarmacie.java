package clase;

public class MedicamentFarmacie implements IFarmacieMedicament{
   private String denumire;
   private float pret;
   private boolean eInStoc;

    public MedicamentFarmacie(String denumire, float pret, boolean eInStoc) {
        this.denumire = denumire;
        this.pret = pret;
        this.eInStoc = eInStoc;
    }

    @Override
    public void cumparaMedicament() {
        if(eInStoc){
            System.out.println("Medicamentul "+denumire + " s a cumparat la pretul de "+ pret);
        }
        else {
            System.out.println("Medicamentul "+ denumire+ " nu se afla in stoc");
        }
    }
}
