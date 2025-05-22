package clase;

public class ProxyPachet implements PachetTuristic{

    private PachetTransport pachetTransport;

    public ProxyPachet(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }

    public PachetTransport getPachetTransport() {
        return pachetTransport;
    }

    public void setPachetTransport(PachetTransport pachetTransport) {
        this.pachetTransport = pachetTransport;
    }


    @Override
    public void descriere() {
        pachetTransport.descriere();
    }

    @Override
    public void rezervarePachet() {
        if (pachetTransport.getPersoana().getVarsta() >= 18) {
            pachetTransport.rezervarePachet();
        } else {
            System.out.println("Rezervare nu e permisa nu esti major");
        }
    }
}
