import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("Số nhập vào không hợp lệ.");
        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0.");
        } finally {
            System.out.println("Program finished.");
        }
    }
}
