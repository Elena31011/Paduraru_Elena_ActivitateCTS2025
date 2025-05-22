package clase;

public class InternareUrgente extends AInternare {
    @Override
    public void dificultateStarePacient(Pacient pacient) {
        System.out.println("Se verifica gradul dificultate: " + pacient.getGradDificultate());
            pacient.getGradDificultate();
    }

    @Override
    public void disponibilitateSalon() {
        System.out.println("A fost repartizat in salon de urgengte");
    }

    @Override
    public void emiteFisaInternare(Pacient pacient) {
        System.out.println("Internam pacientul "+ pacient.getNume()+" la urgente ca e grav");
    }

}
