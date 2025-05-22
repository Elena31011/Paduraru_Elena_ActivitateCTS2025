package clase;

public class SpitalPublic extends TamplateInternare{
    private String numeSpital;

    public SpitalPublic(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    int analizaDificultate(Pacient pacient) {
        return pacient.getGradDificultate() ;
    }

    @Override
    void disponibilitateSalon() {
        System.out.println("Nu sunt locuri la spital public "+ this.numeSpital);
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul "+pacient.getNume()+ " a fost mutat la alt spital");
    }
}
