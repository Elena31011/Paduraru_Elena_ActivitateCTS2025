package ro.acs.main;

import ro.acs.clase.AbstractLivePrototype;
import ro.acs.clase.Live;
import ro.acs.clase.LiveEvenimentConnection;

public class Main {
    public static void main(String[] args) {
        LiveEvenimentConnection prototype =new LiveEvenimentConnection();
        Live live = (Live) prototype.getLive(LiveEvenimentConnection.FACEBOOK);
        System.out.println((live));
        live.addComment("merge");
        System.out.println(live);
        Live live1 = (Live) prototype.getLive(LiveEvenimentConnection.INSTAGRAM);
        live1.addComment("new comment");
        System.out.println(live1);

    }
}
