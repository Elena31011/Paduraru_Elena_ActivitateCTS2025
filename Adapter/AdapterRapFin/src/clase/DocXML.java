package clase;

public class DocXML implements IDocXML{
   private String nume;

    @Override
    public void emiteRaport() {
        System.out.println("A fost transis raportul sub forma XML cu numele "+ nume);
    }
}
