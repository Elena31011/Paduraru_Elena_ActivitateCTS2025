package clase;

public class CardBancar implements IMetodaPlata{
    private float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }


    @Override
    public void plateste(float pretBilet) {
        if(this.sold > pretBilet){
            sold = sold-pretBilet;
            System.out.println("A reusit plata cu cardul");
        }
        else {
            System.out.println("Nu mai ai bani pe card");
        }
    }
}
