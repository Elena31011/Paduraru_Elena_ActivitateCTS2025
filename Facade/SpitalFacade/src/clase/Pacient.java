package clase;

public class Pacient {
    private String numePacient;
    private int grvitatePacient;

    public Pacient(String numePacient, int grvitatePacient) {
        this.numePacient = numePacient;
        this.grvitatePacient = grvitatePacient;
    }

    public String getNumePacient() {
        return numePacient;
    }

    public int getGrvitatePacient() {
        return grvitatePacient;
    }
}
