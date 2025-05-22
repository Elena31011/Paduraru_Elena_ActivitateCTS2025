package clase;

public class SoftScanareGestiune implements IInventarNou{
    private String nume;

    public SoftScanareGestiune(String nume) {
        this.nume = nume;
    }

    @Override
    public void inregistrareItem() {
        System.out.println("S a inregistrat itemu cu numele de "+nume);
    }
}
