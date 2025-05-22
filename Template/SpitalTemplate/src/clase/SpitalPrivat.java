package clase;

public class SpitalPrivat extends TamplateInternare{

    @Override
    int analizaDificultate(Pacient pacient) {
        return pacient.getGradDificultate();
    }

    @Override
    void disponibilitateSalon() {
        System.out.println("Avem paturi disp pt pacient");
    }

    @Override
    void emitereFisa(Pacient pacient) {
        System.out.println("Pentru pacientul"+pacient.getNume()+" s a emis fisa de internare");
    }
}
