public class Main {
    public static void main(String[] args) {
        Integer[] integers = {5, 1, 3, 2};
        ArrayUtils.sort(integers);
        ArrayUtils.printArray(integers);

        String[] strings = {"Java", "C++", "Python"};
        ArrayUtils.sort(strings);
        ArrayUtils.printArray(strings);

        Student[] students = {new Student("Nam", 3.67), new Student("Huu", 3.4)};
        ArrayUtils.sort(students);
        ArrayUtils.printArray(students);
    }
}
