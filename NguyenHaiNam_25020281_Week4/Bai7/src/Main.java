import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine().trim());
        ArrayList<Student> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String id = parts[0];
            String name = parts[1];
            double gpa = Double.parseDouble(parts[2]);
            
            students.add(new Student(id, name, gpa));
        }
        scanner.close();
        System.out.println("-------------------------");

        students.removeIf(student -> student.getGpa() < 5.0);
        System.out.println("After removing GPA < 5.0:");
        for (Student student : students) {
            System.out.println(student);
        }

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("\nAfter sorting by name:");
        students.forEach(System.out::println);

        System.out.println("-------------------------");

        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> sub = (a, b) -> a - b;
        Operation<Double> mul = (a, b) -> a * b;
        Operation<Double> div = (a, b) -> b != 0 ? a / b : 0.0;
        System.out.println(add.excute(10.0, 3.2));


    }
}
