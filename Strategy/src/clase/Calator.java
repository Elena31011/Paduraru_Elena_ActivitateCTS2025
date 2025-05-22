package clase;

public class Calator {
    private String numeCalator;
    private IMetodaPlata metodaPlata;

    public void setMetodaPlata(IMetodaPlata metodaPlata) {
        this.metodaPlata = metodaPlata;
    }

    public Calator(String numeCalator ) {
        super();
        this.numeCalator = numeCalator;
        this.metodaPlata = new CardBancar(10);
    }
    public Calator(String numeCalator, IMetodaPlata metodaPlata ) {
        super();
        this.numeCalator = numeCalator;
        this.metodaPlata = metodaPlata;
    }
    public void platesteCalatorie(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }

}
