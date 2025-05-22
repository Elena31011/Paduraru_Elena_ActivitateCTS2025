package clase;

public class Receptionist {
    public boolean masaELibera(Masa masa){
        return masa.getNrMasa()%4 == 0;
    }
}
