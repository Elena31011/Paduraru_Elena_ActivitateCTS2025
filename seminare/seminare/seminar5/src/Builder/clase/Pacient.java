package Builder.clase;

public class Pacient {
    private String nume;
    private String numePrieten;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciDeCamera;
    private boolean areHalatPentruInterior;

    public Pacient(){

    }

    protected Pacient(String nume, String numePrieten, boolean arePatRabatabil, boolean areMicDejunInclus, boolean arePapuciDeCamera, boolean areHalatPentruInterior) {
        this.nume = nume;
        this.numePrieten = numePrieten;
        this.arePatRabatabil = arePatRabatabil;
        this.areMicDejunInclus = areMicDejunInclus;
        this.arePapuciDeCamera = arePapuciDeCamera;
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNumePrieten(String numePrieten) {
        this.numePrieten = numePrieten;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciDeCamera(boolean arePapuciDeCamera) {
        this.arePapuciDeCamera = arePapuciDeCamera;
    }

    public void setAreHalatPentruInterior(boolean areHalatPentruInterior) {
        this.areHalatPentruInterior = areHalatPentruInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacient{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numePrieten='").append(numePrieten).append('\'');
        sb.append(", arePatRabatabil=").append(arePatRabatabil);
        sb.append(", areMicDejunInclus=").append(areMicDejunInclus);
        sb.append(", arePapuciDeCamera=").append(arePapuciDeCamera);
        sb.append(", areHalatPentruInterior=").append(areHalatPentruInterior);
        sb.append('}');
        return sb.toString();
    }
}
