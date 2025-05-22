package clase;

public class ProxyPacient implements IInternare {

    private Internare internare;

    public ProxyPacient(Internare internare) {
        this.internare = internare;
    }

    @Override
    public void internarePacient(String nume, boolean asigSanatate) {
        if(asigSanatate == true){
            internare.internarePacient(nume, asigSanatate);        }
        else {
            System.out.println("Pacientul " + nume + " nu are asigurare nu l putem interna");
        }
    }
}
