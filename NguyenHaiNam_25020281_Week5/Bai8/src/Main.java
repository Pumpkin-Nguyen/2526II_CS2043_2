import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReadWrite.writer(scanner);

        ReadWrite.reader(scanner);

        scanner.close();
    }
}
