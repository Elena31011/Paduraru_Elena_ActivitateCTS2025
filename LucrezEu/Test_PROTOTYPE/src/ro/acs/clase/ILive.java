package ro.acs.clase;


import java.util.List;

public interface ILive {
    String getTitle();
    void settitle();
    byte[] getStream();
    List<String> getComments();
    void addComment(String comment);
}
