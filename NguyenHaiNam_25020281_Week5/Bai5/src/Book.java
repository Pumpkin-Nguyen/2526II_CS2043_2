public class Book {
    private String id, title, author;
    private int year;

    public Book(String id, String title, String author, int year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%s (%s, %d)", title, author, year);
    }
}
