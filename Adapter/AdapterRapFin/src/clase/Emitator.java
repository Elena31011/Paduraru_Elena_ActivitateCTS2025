package clase;

public class Emitator {
    private String numeEmitator;

    public Emitator(String numeEmitator) {

        this.numeEmitator = numeEmitator;
    }


    public String getNumeEmitator() {
        return numeEmitator;
    }

    public void setNumeEmitator(String numeEmitator) {
        this.numeEmitator = numeEmitator;
    }

    public void emitereDocument(IDocXML docXML){
        System.out.println(numeEmitator+" emite");
        docXML.emiteRaport();
    }
}
