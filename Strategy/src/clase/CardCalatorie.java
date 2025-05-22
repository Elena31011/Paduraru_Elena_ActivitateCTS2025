package clase;

public class CardCalatorie implements IMetodaPlata{
    private int nrCalatorii;

    public CardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }


    @Override
    public void plateste(float pretBilet) {
        if(this.nrCalatorii>0){
            this.nrCalatorii--;
            System.out.println("Plata cu cardul de calatorii validata");
        }
        else{
            System.out.println("Nu mai ai calatorii pe card");
        }
    }
}
