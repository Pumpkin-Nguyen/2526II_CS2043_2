public class Student {
    private String id, name, email;
    private double gpa;

    public Student() {   }
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student(Student anotherStudent) {
        this.id = anotherStudent.id;
        this.name = anotherStudent.name;
        this.email = anotherStudent.email;
        this.gpa = anotherStudent.gpa;
    }

    public void setId(String id) {
        if (id.length() <= 0) {
            System.out.println("ID can't be empty.");
        } else {
            this.id = id;
        }
    }
    public void setName(String name) {
        if (name.length() <= 0) {
            System.out.println("Name can't be empty.");
        } else {
            this.name = name;
        }
    }
    public void setEmail(String email) {
        if (email.length() <= 0) {
            System.out.println("Email can't be empty.");
        } else {
            this.email = email;
        }
    }
    public void setGpa(double gpa) {
        if (gpa < 0 || gpa > 4) {
            System.out.println("GPA must be between 0.0 and 4.0");
        } else {
            this.gpa = gpa;
        }
    }

    public void display() {
        System.out.printf("ID: %s | Name: %s | Email: %s | GPA: %.2f\n", this.id, this.name, this.email, this.gpa);
    }

    public static void main() {
        Student student1 = new Student();
        Student student2 = new Student("25020281", "Nguyen Hai Nam");
        Student student3 = new Student(student2);

        student3.setGpa(-2);

        student2.setEmail("25020281@vnu.edu.vn");
        student2.setGpa(3.99);

        student1.display();
        student2.display();
        student3.display();
    }
}
