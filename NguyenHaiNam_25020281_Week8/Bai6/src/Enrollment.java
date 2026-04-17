public class Enrollment {
    private Student student;
    private Course course;

    private double midtermScore;
    private double finalScore;
    private double assignmentScore;

    public Enrollment(Student student, Course course, double midtermScore, double finalScore, double assignmentScore) {
        this.student = student;
        this.course = course;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
        this.assignmentScore = assignmentScore;
    }

    public double calculateFinalGrade() {
        return assignmentScore * 0.2 + midtermScore * 0.3 + finalScore * 0.5;
    }

    public String getAcademicStatus() {
        double grade = calculateFinalGrade();
        if (grade >= 8.5) return "Giỏi";
        if (grade >= 7.0) return "Khá";
        if (grade >= 5.5) return "Trung bình";
        return "Yếu";
    }

    public void printTranscript() {
        System.out.println("Sinh viên: " + student.getName() + " (" + student.getId() + ")");
        System.out.println("Môn học: " + course.getName() + " (" + course.getId() + ") - " + course.getCredits() + " tín chỉ");
        System.out.println("Điểm GK: " + midtermScore + " | Điểm CK: " + finalScore
                         + " | Điểm BT: " + assignmentScore);
        System.out.printf("Điểm tổng kết: %.1f - Học lực: %s%n",
                          calculateFinalGrade(), getAcademicStatus());
    }
}
