abstract class Employee {
    private String id, name, birthday;
    public Employee(String id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }
    
    public abstract double countTotalSalary();
    public abstract void printDetails();
}
