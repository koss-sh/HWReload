package hw12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("George", "Orwell");
        Author author2 = new Author("Stephen", "King");
        Book book1 = new Book("1984", author1, 2000);
        Book book2 = new Book("It", author2, 1995);
        System.out.println("The first book is " + author1.getFirstName() + " " +
                author1.getLastName() + "'s " + book1.getName());
        System.out.println("Publishing year is " + book1.getPublishingYear());
        System.out.println("The second one is " + author2.getFirstName() + " " +
                author2.getLastName() + "'s " + book2.getName());
        System.out.println("Publishing year is " + book2.getPublishingYear());
        book1.setPublishingYear(2005);
        System.out.println("Now publ. year of the " + author1.getLastName()
                + "'s book is " + book1.getPublishingYear());
        System.out.println("Author 1: " + author1);
        System.out.println("Author 2: " + author2);
        System.out.println(book1);
    }
}
