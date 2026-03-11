public class Book {
    private String title, author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book otherBook = (Book) obj;
        return (this.title == otherBook.title) && 
            (this.author == otherBook.author) &&
            (Double.compare(this.price, otherBook.price) == 0);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Miễn dịch", "Kurzgesagt", 36.00);
        Book book2 = new Book("Miễn dịch", "Kurzgesagt", 36.00);

        System.out.println("So sánh với ==: " + (book1 == book2));
        System.out.println("So sánh với equals: " + (book1.equals(book2)));
    }
    
}
