package clase;

public class Item {
    private String nume;

    public Item(String nume) {
        this.nume = nume;
    }

    public void avemUnNouItem(){
        System.out.println("Avem un nou item "+ nume);
    }
}
