package clase;

public class DocJSON {
     private String numeDoc;

    public DocJSON(String numeDoc) {
        this.numeDoc = numeDoc;
    }

    public void emitereDocument(){
        System.out.println("S-a trimis documentul "+numeDoc);
    }
}
