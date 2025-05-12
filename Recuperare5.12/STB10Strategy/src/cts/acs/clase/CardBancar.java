package cts.acs.clase;

public class CardBancar implements IMetodaPlata{
    int sold;

    public CardBancar(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(sold>=pretBilet){
            System.out.println("Ai platit cu cardul");
            sold -=pretBilet;
        }
        else{
            System.out.println("Nu ai bani pe card");
        }
    }
}
