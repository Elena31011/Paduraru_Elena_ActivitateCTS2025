package clase;

public class Persoana implements IPersoana{
    private String numeHotel;
    private String destinatie;
    private boolean micDejun;
    private int cod;

    public Persoana(String numeHotel, String destinatie, boolean micDejun, int cod) {
        this.numeHotel = numeHotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
        this.cod = cod;
    }

    public String getNumeHotel() {
        return numeHotel;
    }

    public void setNumeHotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("numeHotel='").append(numeHotel).append('\'');
        sb.append(", destinatie='").append(destinatie).append('\'');
        sb.append(", micDejun=").append(micDejun);
        sb.append(", cod=").append(cod);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii(Preferinte p) {
        System.out.println(this.toString());
        System.out.println(p.toString());
    }
}
