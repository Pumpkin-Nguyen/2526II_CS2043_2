import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Source file: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Target file: ");
        String targetFile = scanner.nextLine();

        BufferedReader reader = null;
        PrintWriter writer = null;
        int lineCount = 0;

        try {
            try {
                reader = new BufferedReader(new FileReader(sourceFile));
            } catch (FileNotFoundException e) {
                System.out.println("Source file not found.");
                return;
            }

            try {
                writer = new PrintWriter(new FileWriter(targetFile));
            } catch (FileNotFoundException e) {
                System.out.println("Cannot create destination file.");
                return;
            }

            String line = "";
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                lineCount++;
            }
            System.out.printf("Copied %d lines!\n", lineCount);

        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Closing files error.");
                e.printStackTrace();
            }

            scanner.close();
        }

    }
}
