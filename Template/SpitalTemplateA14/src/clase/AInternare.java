package clase;

public abstract class AInternare {
    public abstract void dificultateStarePacient(Pacient pacient);
    public abstract void disponibilitateSalon();
    public abstract void emiteFisaInternare(Pacient pacient);

    public final void internare(Pacient pacient){
       if(pacient.getGradDificultate()<3){
           System.out.println("Nu are nevoie de internare");
       }
       else {
           dificultateStarePacient(pacient);
           disponibilitateSalon();;
           emiteFisaInternare(pacient);
       }
    }
}
