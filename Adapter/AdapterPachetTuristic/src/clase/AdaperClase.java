package clase;

public class AdaperClase extends MasinaInchiriata implements PachetTuristic{
    public AdaperClase(Masina masina) {
        super(masina);
    }

    @Override
    public void descriere() {
        System.out.println(super.toString());
    }

    @Override
    public void rezervaPachet() {
        super.inchiriazaMasina();
    }
}
