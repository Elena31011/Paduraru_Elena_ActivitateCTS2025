package clase;

public class BiletMetrou implements IBiletMetrou{
   private int nrCalatorii;

    public BiletMetrou(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void validareBilet() {
        if(nrCalatorii>=1){
            System.out.println("Calatorie validata din metrou");
            this.nrCalatorii--;
        }
        else System.out.println("Nu mai ai calatorii");
    }
}
