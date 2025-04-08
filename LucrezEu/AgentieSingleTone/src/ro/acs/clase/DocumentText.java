package ro.acs.clase;

public class DocumentText implements IDocument {
    private String text;
    private int nrPagini;
    private boolean color;

    public DocumentText(String text, int nrPagini, boolean color) {
        this.text = text;
        this.nrPagini = nrPagini;
        this.color = color;
    }

    @Override
    public int getNrPagini() {
        return 0;
    }

    @Override
    public boolean isColor() {
        return false;
    }

    @Override
    public String getText() {
        return "";
    }

    @Override
    public void afisareDocument() {

    }
}
