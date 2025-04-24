package clase;

public class Webinar implements IEvent{
        private String title;

     Webinar(String title) {
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Webinar{");
        sb.append("title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
