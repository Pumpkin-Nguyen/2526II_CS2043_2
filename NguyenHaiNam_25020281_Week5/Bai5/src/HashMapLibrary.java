import java.util.HashMap;
import java.util.Map;

public class HashMapLibrary implements ILibrary {
    private final Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    @Override
    public Book findBookById(String id) {
        return books.get(id);
    }

    @Override
    public void removeBookById(String id) {
        books.remove(id);
    }

    @Override
    public void displayBooks() {
        books.values().forEach(System.out::println);
    }
}
