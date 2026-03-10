public class Employee {
    String name;
    MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = new MyDate(birthday);
    }
    
    public Employee(Employee otherEmployee) {
        this.name = otherEmployee.name;
        this.birthday = otherEmployee.birthday;
    }

    public static void main() {
        MyDate emp1Date = new MyDate(1, 1, 2000);
        Employee emp1 = new Employee("Nam", emp1Date);
        Employee emp2 = new Employee(emp1);

        MyDate newDate = new MyDate(2, 2, 2022);
        emp1.birthday = newDate;

        System.out.print("Employee 1: ");
        emp1.birthday.display();
        System.out.print("Employee 2: ");
        emp2.birthday.display();
    }
}
