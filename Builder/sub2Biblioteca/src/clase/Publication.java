package clase;

import java.util.List;

public class Publication implements IAbstractPublication{
   private String titlu;
   private List<String>  autors;
   private String publisher;
   private String language;
   private String genre;
   private int year;
   private int isbn;
   private int price;

    protected Publication(String titlu, List<String> autors, String publisher, String language, String genre, int year, int isbn, int price) {
        this.titlu = titlu;
        this.autors = autors;
        this.publisher = publisher;
        this.language = language;
        this.genre = genre;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    @Override
    public String getTitle() {
        return titlu;
    }

    @Override
    public List<String> getAuthors() {
        return autors;
    }

    @Override
    public String getPublisher() {
        return publisher;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public long getIsbn() {
        return isbn;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publication{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", autors=").append(autors);
        sb.append(", publisher='").append(publisher).append('\'');
        sb.append(", language='").append(language).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", year=").append(year);
        sb.append(", isbn=").append(isbn);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
