package clase;

public abstract class ARecomandareImbracaminte {
    public ARecomandareImbracaminte urmatorul;

    public void setUrmatorul(ARecomandareImbracaminte urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void recomanda(int grade);
}
