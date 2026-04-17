public class Course extends Entity {
    private int credits;

    public Course(String courseId, String courseName, int credits) {
        super(courseId, courseName);
        this.credits = credits;
    }

    public int getCredits() {
        return this.credits;
    }

}
