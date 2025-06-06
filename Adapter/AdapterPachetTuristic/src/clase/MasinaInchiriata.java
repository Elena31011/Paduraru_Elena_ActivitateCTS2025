package clase;

public class MasinaInchiriata {
    private Masina masina;

    public MasinaInchiriata(Masina masina) {
        this.masina = masina;
    }

    public void inchiriazaMasina(){
        System.out.println("A fost inchitiata masina: " + masina.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MasinaInchiriata{");
        sb.append("masina=").append(masina);
        sb.append('}');
        return sb.toString();
    }
}
