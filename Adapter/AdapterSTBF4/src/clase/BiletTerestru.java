package clase;

public class BiletTerestru {
    private int nrCalatorii;

    public BiletTerestru(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }
    public void controlBiletTerestru(){
        if(nrCalatorii>=1){
            System.out.println("Calatorie validata din terestru");
            this.nrCalatorii--;
        }
        else System.out.println("Nu mai ai calatorii");
    }

}
