package main;

import clase.EnumEvents;
import clase.FacroryEvents;
import clase.IEvent;

public class Main {
    public static void main(String[] args) {
        FacroryEvents facroryEvents = new FacroryEvents();
        IEvent event =facroryEvents.getEvent(EnumEvents.WEBINAR, "titlu");
        System.out.println(event);
    }
}
