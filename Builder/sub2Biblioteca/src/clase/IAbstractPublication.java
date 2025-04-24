package clase;

import java.util.List;

public interface IAbstractPublication {
    String getTitle();
    List<String> getAuthors();
    String getPublisher();
    String getLanguage();
    String getGenre();
    int getYear();
    long getIsbn();
    float getPrice();
}
