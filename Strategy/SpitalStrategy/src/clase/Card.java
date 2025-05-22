package clase;

public class Card implements IMetodaPlata{
    private float sold;

    public Card(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pret) {
        if(sold>20){
            sold = sold-pret;
            System.out.println("Plata reusita cu succes ");
            System.out.println("Mai ai in cont "+sold);
        }
        else {
            System.out.println("Nu mai ai bani in cont");
        }
    }
}
