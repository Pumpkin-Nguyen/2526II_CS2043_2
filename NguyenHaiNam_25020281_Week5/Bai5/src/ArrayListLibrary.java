import java.util.ArrayList;
import java.util.List;

public class ArrayListLibrary implements ILibrary {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Book findBookById(String id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void removeBookById(String id) {
        books.removeIf(book -> book.getId().equals(id));
    }

    @Override
    public void displayBooks() {
        books.forEach(System.out::println);
    }
}
