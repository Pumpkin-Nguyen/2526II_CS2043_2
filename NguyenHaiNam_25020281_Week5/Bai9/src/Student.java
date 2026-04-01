import java.io.Serializable;

public class Student implements Serializable {
    private String id, name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    } 

    @Override
    public String toString() {
        return String.format("%s - %s - %.2f", id, name, gpa);
    }
}
