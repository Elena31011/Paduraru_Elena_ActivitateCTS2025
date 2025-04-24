package clase;

public interface IEvent {
    String getTitle();
    void setTitle(String title);
    void broadcast();
}
