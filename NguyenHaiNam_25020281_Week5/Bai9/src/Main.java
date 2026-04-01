import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        writer(scanner);
        reader(scanner);

        scanner.close();
    }

    public static void writer(Scanner scanner) {

        System.out.print("Target file: ");
        String file = scanner.nextLine();

        System.out.println("Input students information in-line (ID Name Gpa): ");
        try (ObjectOutputStream writerStream = new ObjectOutputStream(new FileOutputStream(file))) {

            String line = "";
            while (!(line = scanner.nextLine()).equals("END")) {
                String[] parts = line.split(" ");
                String id = parts[0];
                String name = parts[1];
                double gpa = Double.parseDouble(parts[2]);

                writerStream.writeObject(new Student(id, name, gpa));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        }
    }

    public static void reader(Scanner scanner) {
        System.out.print("Source file: ");
        String file = scanner.nextLine();

        System.out.println("Reading students from file: ");
        try (ObjectInputStream readerStream = new ObjectInputStream(new FileInputStream(file))) {

            while (true) {
                try {
                    Student student = (Student) readerStream.readObject();
                    System.out.println(student);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }

}
