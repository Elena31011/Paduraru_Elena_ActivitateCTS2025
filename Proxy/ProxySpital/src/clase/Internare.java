package clase;

public class Internare implements IInternare {

    @Override
    public void internarePacient(String nume, boolean asigSanatate) {
        System.out.println("Pacientul "+ nume +" are asigurare si se interneaza");
    }
}
