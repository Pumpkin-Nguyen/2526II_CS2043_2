import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        LibrarySection<Book> bookSection = new LibrarySection<>("Sách");
        LibrarySection<DVD> DVDSection = new LibrarySection<>("DVD");

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String type = parts[0];
            String id = parts[1];
            String name = parts[2];
            if (type.equals("B")) {
                String author = parts[3];
                int pageNums = Integer.parseInt(parts[4]);
                bookSection.addItem(new Book(id, name, author, pageNums));
            } else if (type.equals("D")) {
                String author = parts[3];
                int length = Integer.parseInt(parts[4]);
                DVDSection.addItem(new DVD(id, name, author, length));
            }
        }
        System.out.println();

        scanner.close();

        bookSection.check();
        System.out.println();
        DVDSection.check();
    }
}
