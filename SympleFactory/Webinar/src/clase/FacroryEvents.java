package clase;

public class FacroryEvents {
    public IEvent getEvent(EnumEvents enumEvents, String title){
        switch (enumEvents){
            case WEBINAR -> {
                return new Webinar(title);
            }
            case WORKSHOP -> {
                return new Workshop(title);
            }
            case CONFERINTA -> {
                new Conferinta(title);
            }
        }
        return null;
    }
}
