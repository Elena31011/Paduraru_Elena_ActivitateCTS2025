package clase;

public class InternareUsoara extends AInternare{


    @Override
    public void dificultateStarePacient(Pacient pacient) {
        System.out.println("S-a verificat starea pacient este urgenta " + pacient.getGradDificultate());
    }

    @Override
    public void disponibilitateSalon() {
        System.out.println("Salonul este disponibil;");
    }

    @Override
    public void emiteFisaInternare(Pacient pacient) {
        System.out.println("S-a internat pacientul "+ pacient.getNume()+" acesta e internat la internari usoare doar 2 zie");
    }

}
