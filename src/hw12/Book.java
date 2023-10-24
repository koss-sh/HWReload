package hw12;

public class Book {
    private String name;
    private Author author;
    private int PublishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        PublishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return PublishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        PublishingYear = publishingYear;
    }
}
