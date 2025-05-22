package clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int linie) {
        super(linie);
    }

    @Override
    public void pleacaDeLaCapatLinie() {
        trimiteMesaj("Autobuzul cu numarul " + this.getLinie() + " pleaca de la capatul liniei");
    }

    public void schimbaTraseul(){
        trimiteMesaj("Autobuzul cu numarul " + this.getLinie()+" va cirucula prin x" );
    }
}
