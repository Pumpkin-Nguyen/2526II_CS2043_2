public class MyDate {
    int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(MyDate otherMyDate) {
        this.day = otherMyDate.day;
        this.month = otherMyDate.month;
        this.year = otherMyDate.year;
    }

    public void display() {
        System.out.printf("%d/%d/%d\n", this.day, this.month, this.year);
    }
}