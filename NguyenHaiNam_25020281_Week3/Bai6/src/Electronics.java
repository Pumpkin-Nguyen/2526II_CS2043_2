public class Electronics extends Product {
    private double warrantyExpense;

    public Electronics(String id, String name, double price) {
        super(id, name, price);
        this.warrantyExpense = 0;
    }

    public Electronics(String id, String name, double price, double warrantyExpense) {
        super(id, name, price);
        this.warrantyExpense = warrantyExpense;
    }

    @Override
    public double getFinalPrice() {
        return this.getPrice() * 1.1 + warrantyExpense;
    }

    @Override
    public void printDetails() {
        System.out.printf("%s - Electronics - %.1f\n", this.getName(), this.getFinalPrice());
    }
}
