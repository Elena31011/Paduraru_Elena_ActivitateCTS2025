package clase;

public class Adapter extends DocJSON implements IDocXML{
    public Adapter(String numeDoc) {
        super(numeDoc);
    }

    @Override
    public void emiteRaport() {
        super.emitereDocument();
    }
}
