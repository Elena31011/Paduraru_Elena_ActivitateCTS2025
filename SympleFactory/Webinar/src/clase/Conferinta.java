package clase;

public class Conferinta implements IEvent{
    private String title;

     Conferinta(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        System.out.println("Titlu");
    }

    @Override
    public void broadcast() {
        System.out.println("Nu stiu ce e");
    }
}
