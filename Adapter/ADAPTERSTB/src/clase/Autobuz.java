package clase;

public class Autobuz {
    private String modelAutobuz;

    public Autobuz(String modelAutobuz) {
        this.modelAutobuz = modelAutobuz;
    }

    public String getModelAutobuz() {
        return modelAutobuz;
    }

    public void DeschidereUsi(){
        System.out.println("Autobuzul de model "+modelAutobuz+" din apasarea de buton: \n");
    }
}
