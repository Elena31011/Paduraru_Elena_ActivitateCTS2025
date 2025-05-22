package clase;

public class Medic {

    public boolean interneazaPacient(Pacient pacient){
        if(pacient.getGrvitatePacient() > 5){
            return true;
        }
        else return false;
    }
}
