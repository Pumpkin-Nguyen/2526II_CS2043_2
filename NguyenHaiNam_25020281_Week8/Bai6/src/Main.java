public class Main {
    public static void main(String[] args) {
        Student me = new Student("25020281", "Nguyen Hai Nam", 3.99);
        Course cs = new Course("CS-2", "Lap trinh nang cao", 3);

        Enrollment enrollment = new Enrollment(me, cs, 9.5, 9.6, 10);

        enrollment.printTranscript();
    }
}
