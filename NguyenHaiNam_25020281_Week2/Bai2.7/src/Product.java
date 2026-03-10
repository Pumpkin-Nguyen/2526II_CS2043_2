public class Product {
    private String id, name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        if (newPrice < 0) {
            System.out.println("Price can't lower than 0.");
            return;
        }
        this.price = newPrice;
    }

    public void display() {
        System.out.printf("ID: %s | Name: %s | Price: %.2f\n", id, name, price);
    }
}
