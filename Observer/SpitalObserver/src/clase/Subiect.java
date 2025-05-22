package clase;

public interface Subiect {
    void adaugaObservator(Observator observator);
    void stergeObservator(Observator observator);
    void trimiteNotificare(String mesaj);
}
