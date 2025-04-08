package ro.acs.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Live extends AbstractLivePrototype{

    private String title;
    private byte[] stream;
    private List<String> comments;

    public Live(String title, byte[] stream) {
        this.title = title;
        this.stream = stream;
        this.comments = new ArrayList<>();
    }

    @Override
    public AbstractLivePrototype clone() {
        Live clona = (Live) super.clone();
        clona.title=title;
        clona.stream=stream;
        clona.comments=new ArrayList<>();
        return clona;
    }

    @Override
    public String getTitle() {
        return "";
    }

    @Override
    public void settitle() {
        System.out.println("Title" + title);
    }

    @Override
    public byte[] getStream() {
        return stream;
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Live{");
        sb.append("title='").append(title).append('\'');
        sb.append(", stream=").append(Arrays.toString(stream));
        sb.append(", comments=").append(comments);
        sb.append('}');
        return sb.toString();
    }
}
