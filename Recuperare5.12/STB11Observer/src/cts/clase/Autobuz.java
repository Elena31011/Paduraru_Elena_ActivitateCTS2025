package cts.clase;

public class Autobuz extends MijlocTransport{
  public Autobuz(int numarLinie){
      super(numarLinie);
  }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuz numarul" + this.getNumarLinie()+ " pleaca de la capatul liniei");
    }

    public void schimbaTraseu(){
      trimiteMesaj(("Autobuzul  " + this.getNumarLinie() + " va circula prin x nu prin y"));


    }
}
