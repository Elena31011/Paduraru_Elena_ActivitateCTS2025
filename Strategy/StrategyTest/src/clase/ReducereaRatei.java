package clase;

public class ReducereaRatei extends AbstractCreditConditions {
    private int sumaBani;

    public ReducereaRatei(int sumaBani) {
        this.sumaBani = sumaBani;
    }

    @Override
    public double getRate() {
        return super.getRate();
    }

    @Override
    public void setRate(double rate) {
        super.setRate(rate);
    }

    public void returneazaAnticipat(){
        if(sumaBani>500)
        {
           super.setRate(rate-50);
        }
        System.out.println("Rata a ajuns "+super.getRate());
    }
}
