package clase;

public abstract class TamplateInternare {
    abstract int analizaDificultate(Pacient pacient);

    abstract void disponibilitateSalon();

    abstract void emitereFisa(Pacient pacient);

    public final void internare(Pacient pacient){
        if(analizaDificultate(pacient)<3){
            System.out.println("Nu are nev de internare");
        }
        else {
            disponibilitateSalon();
            emitereFisa(pacient);
        }
    }
}
