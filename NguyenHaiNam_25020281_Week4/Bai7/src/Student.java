public class Student {
    private String id, name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public String toString() {
        return "%s %s %.1f".formatted(this.id, this.name, this.gpa);
    }

}