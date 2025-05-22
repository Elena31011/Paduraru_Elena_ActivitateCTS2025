package clase;

public class Facade {
    public String verificaDacaInternam(Pacient pacient, Salon salon){
        Medic medic = new Medic();
        if(medic.interneazaPacient(pacient)){
            if(salon.eLiberPatul()){
                return "Medicul interneaza pacientul cu numele "+pacient.getNumePacient();
            }


            else return "Patul nu e liber";
        }
        else return "Starea pacientului nu e prea grava";
    }

}
