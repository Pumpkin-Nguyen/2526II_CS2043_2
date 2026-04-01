public interface ILibrary {
    void addBook(Book book);
    Book findBookById(String id);
    void removeBookById(String id);
    void displayBooks();

}
