import java.util.Map;
import java.util.TreeMap;

public class TreeMapLibrary implements ILibrary {
    private final Map<String, Book> books = new TreeMap<>();

    @Override
    public void addBook(Book book) {
        books.put(book.getId(), book); // O(log n)
    }

    @Override
    public Book findBookById(String id) {
        return books.get(id); // O(log n)
    }

    @Override
    public void removeBookById(String id) {
        books.remove(id); // O(log n)
    }

    @Override
    public void displayBooks() {
        books.values().forEach(System.out::println);
    }
}
