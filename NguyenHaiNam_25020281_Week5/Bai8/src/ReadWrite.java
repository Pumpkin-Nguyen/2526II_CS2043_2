import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrite {
    
    public static void writer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = Integer.parseInt(scanner.nextLine());
        
        System.out.print("n numbers (write in-line): ");
        String[] parts = scanner.nextLine().split(" ");

        System.out.print("Target file: ");
        String file = scanner.nextLine();

        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            numbers.add(Integer.parseInt(part));
        }

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))) {
            for (Integer num : numbers) {
                dos.writeInt(num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Target file cannot be created or opended.");
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        }

        scanner.close();
    }

    public static void reader() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Source file: ");
        String file = scanner.nextLine();

        System.out.println("Reading:");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    int num = dis.readInt();
                    System.out.print(num + " ");
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        }
        
        scanner.close();
    }
}
