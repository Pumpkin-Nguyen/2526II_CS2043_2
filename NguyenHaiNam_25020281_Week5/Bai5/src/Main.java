public class Main {
    static Book b1 = new Book("001", "Java: A Beginner’s Guide", "Herbert Schildt", 2024);
    static Book b2 = new Book("002", "Immune", "Philipp Dettmer", 2021);
    static Book b3 = new Book("003", "Foundations of Algorithms Using Java Pseudocode", "Richard E. Neapolitan", 2004);
    static Book b4 = new Book("004", "Artificial Intelligence in Daily Life", "Raymond S. T. Lee ", 2020);
    static Book b5 = new Book("005", "Fundamentals of OOP and Data Structures in Java", "Richard Wiener", 2000);
    static String idSearch = "003";
    static String idDelete = "005";

    public static void main(String[] args) {

        System.out.println("---Library use ArrayList---");
        ArrayListLibrary library1 = new ArrayListLibrary();
        process(library1);

        System.out.println("---Library use HashMap---");
        HashMapLibrary library2 = new HashMapLibrary();
        process(library2);

        System.out.println("---Library use TreeMap---");
        TreeMapLibrary library3 = new TreeMapLibrary();
        process(library3);
    }

    public static void process(ILibrary library) {
        library.addBook(b1); library.addBook(b2);
        library.addBook(b3); library.addBook(b4); library.addBook(b5);

        System.out.println("1. Searching for Id: " + idSearch);
        System.out.println(library.findBookById(idSearch));

        library.removeBookById(idDelete);
        System.out.println("2. Deleted book with Id: " + idDelete);

        System.out.println("3. Books in the library:");
        library.displayBooks();
        System.out.println();
    }
}
