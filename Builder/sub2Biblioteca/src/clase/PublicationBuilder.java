package clase;

import java.util.List;

public class PublicationBuilder {
    private String titlu;
    private List<String> autors;
    private String publisher;
    private String language;
    private String genre;
    private int year;
    private int isbn;
    private int price;

    public PublicationBuilder addTitlu (String titlu){
        this.titlu=titlu;
        return this;
    }

    public PublicationBuilder setAutors(List<String> autors) {
        this.autors = autors;
        return this;
    }

    public PublicationBuilder setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    public PublicationBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public PublicationBuilder setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public PublicationBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    public PublicationBuilder setIsbn(int isbn) {
        this.isbn = isbn;
        return this;
    }

    public PublicationBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Publication build(){
        return new Publication(titlu, autors, publisher, language,genre,year,isbn,price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PublicationBuilder{");
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
